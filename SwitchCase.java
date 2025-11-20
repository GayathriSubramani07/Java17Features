package com.demo;

import java.util.Scanner;

public class SwitchCase {
	
	public static void beforeJava17Switch(int a) {
		String result;
		
		switch (a) {
		case 1:
			result= "ONE";
			break;
		case 2:
			result= "TWO";
			break;
		case 3:
			result= "THREE";
			break;
		case 4:
			result= "FOUR";
			break;
		case 5:
			result= "FIVE";
			break;

		default:
			result= "DEFAULT";
			break;
		}
		System.out.println("Result is : "+ result);
		
	}
	
	
	public static void java17Switch(int a)
	{
		String Value=switch(a) {
		case 1->"One";
		case 2->"Two";
		case 3->"Three";
		case 4->"four";
		case 5->"five";
		default->"Unknow";
		
		
		};
		System.out.println("The value is :"+ Value);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
        SwitchCase.beforeJava17Switch(a);
		SwitchCase.java17Switch(a);
		

	}

}
