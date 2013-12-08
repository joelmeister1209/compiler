#! /bin/bash
rm -rf *~ mine.* theirs.* out.out bin src/*~ testcases/input/*~ testcases/output/*~ 

make

inputPath="testcases/input/myTest.micro"
if [ $1 -eq 0 ] > /dev/null 2>&1 ; then
inputPath="smallTest.micro"
elif [ $1 -eq 1 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/step4_testcase.micro"
outputPath="testcases/output/step4_testcase.out"
elif [ $1 -eq 2 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/step4_testcase2.micro"
outputPath="testcases/output/step4_testcase2.out"
elif [ $1 -eq 3 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/step4_testcase3.micro"
outputPath="testcases/output/step4_testcase3.out"
elif [ $1 -eq 4 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/factorial2.micro"
outputPath="testcases/output/factorial2.out"
elif [ $1 -eq 5 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/fibonacci2.micro"
elif [ $1 -eq 6 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/fma.micro"

fi

ofile="out.out"
resfile="mine.res"
theirres="theirs.res"

echo "-----------------------------------------------------" ;

java -cp classes/:lib/antlr.jar Micro "$inputPath" > $ofile
java -jar compiler.jar "$inputPath" > "theirout"
#./tinyR "$outputPath" > $theirres
if [ $2 -eq 1 ] > /dev/null 2>&1 ; then
	echo "using allocation"
	./tiny $ofile #  > $resfile
else
	echo "not using allocation"
	./tinyR $ofile #  > $resfile
fi
echo
./tinyR $outputPath
#diff -y -b -B $theirres $resfile
exit 0

