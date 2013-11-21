#! /bin/bash
rm -f *~ src/*~

make
inputPath="testcases/input/fma.micro"
outputPath="testcases/output/fma.out"
if [ $1 -eq 1 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/factorial2.micro"
outputPath="testcases/output/factorial2.out"
elif [ $1 -eq 2 ] > /dev/null 2>&1 ; then
inputPath="testcases/input/fibonacci2.micro"
outputPath="testcases/output/fibonacci2.out"
fi

ofile="out.out"
resfile="mine.res"
theirres="theirs.res"
inputPath="testcases/input/myTest.micro"

echo "-----------------------------------------------------" ;


java -cp classes/:lib/antlr.jar Micro "$inputPath" > $ofile
#./tinyR "$outputPath" > $theirres
./tiny $ofile #  > $resfile

#diff -y -b -B $theirres $resfile
exit 0

