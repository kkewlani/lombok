package myTests.other.undoRefactoring;

import lombok.*;
@NoArgsConstructor
public class O0ConNoArgs0 {
	public static int a = 0;
	
	public static void method(){
		/*1: ExtractMethod(methodName) :1*/
		System.out.println(a);
		/*:1:*/
	}
	
	/*2: UndoRefactoring() :2*/
	/*:2:*/
}
