#! /bin/bash
rm -rf *~ mine.* theirs.* out.out bin src/*~ testcases/input/*~ testcases/output/*~ 

if [ $1 = "use" ] > /dev/null 2>&1 ; then
	echo "using allocation"
	x='public boolean useAllocation = false;'
	y='public boolean useAllocation = true;'
	#sed -i -e 's/$x/$y/g' src/InterRep.java
	replace "$x" "$y" -- src/InterRep.java
else 
	echo "not using allocation"
	x='public boolean useAllocation = true;'
	y='public boolean useAllocation = false;'
	#sed -i -e 's/$x/$y/g' src/InterRep.java
	replace "$x" "$y" -- src/InterRep.java
fi
make
ofile=myout
inpath="testcases/input"
opath="testcases/output"
if [ -f "$inpath/$2.micro" ] > /dev/null 2>&1 ; then
	echo "processing $2"
	java -cp classes/:lib/antlr.jar Micro "$inpath/$2.micro" > $ofile
	java -jar compiler.jar "$inpath/$2.micro" > "theirout"
	if [ $1 = "use" ] > /dev/null 2>&1 ; then
		echo "using allocation"
		./tiny $ofile  | head -n -11  > "myres"
		./tiny "theirout" | head -n -11 > "theirres"
	else
		echo "not using allocation"
		./tinyR $ofile  | head -n -11  > "myres"
		./tiny "theirout" | head -n -11 > "theirres"
		#./tinyR "$opath/$2.out" | head -n -11 > "theirres"
	fi
	echo "theirs <-> mine"
	diff -b -B -y "theirres" "myres"  
	exit 0
else
	echo "$2.micro not found...performing full test"
fi
for i in testcases/input/* ; do
	if test -f "$i" ; then
		echo "processing $i"
		java -cp classes/:lib/antlr.jar Micro "$i" > $ofile
		java -jar compiler.jar "$i" > "theirout"
		if [ $1 = "use" ] > /dev/null 2>&1 ; then
			echo "using allocation"
			./tiny $ofile #  > $resfile
		else
			echo "not using allocation"
			./tinyR $ofile #  > $resfile
		fi
		echo "<<<<<<<<<<<<<<<<<<<<<<<<<"
		./tiny "theirout"
		echo ">>>>>>>>>>>>>>>>>>>>>>>>>"
	fi
done

exit 0

