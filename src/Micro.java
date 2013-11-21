//package org.test.antlr;

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


class ErrorCatch extends DefaultErrorStrategy{
	public void reportError(Parser recognizer, RecognitionException e){
		System.out.println("Not Accepted");
		System.exit(1);
	}
}



public class Micro{
	public LinkedHashMap<String,String> test = new LinkedHashMap<String,String>();
	public static void main(String[] args) throws Exception {
		MicroLexer lex;
		MicroParser parser;
		try{
		lex = new MicroLexer(new ANTLRFileStream(args[0]));
		parser = new MicroParser(new CommonTokenStream(lex));
		parser.setErrorHandler(new ErrorCatch());
		parser.program();
		}catch(FileNotFoundException e){
			System.out.println(";ERROR: <"+e.toString()+">");
		}
	//	System.out.print(symbolTable);
	}
}
