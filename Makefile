LIB_ANTLR := lib/antlr.jar
ANTLR_SCRIPT := Micro.g4

all: group compiler

tiny:
	rm -f tiny
	g++ -fno-stack-protector -o tiny tiny4regs.C

#makes the tiny exec from the file posted


group:
	@echo "jmeister"
compiler:
	rm -rf classes build
	mkdir -p build
	java -cp $(LIB_ANTLR) org.antlr.v4.Tool -o build $(ANTLR_SCRIPT)
	mkdir -p classes
	javac -cp $(LIB_ANTLR) -d classes build/*.java src/*.java
clean:
	rm -rf classes build

.PHONY: all group compiler clean



