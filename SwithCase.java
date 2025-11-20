package com.demo;

import java.util.Scanner;

public class SwitchCase {
	
	public static void beforeJava17Switch(int a) {
		
		switch (a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;

		default:
			System.out.println("Default");
			break;
		}
		
	}
	
	
	public static void java17Switch(int a)
	{
		switch(a) {
		case 1->System.out.println("One");
		case 2->System.out.println("Two");
		case 3->System.out.println("Three");
		case 4->System.out.println("four");
		case 5->System.out.println("five");
		default->System.out.print("Unknow");
		
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
        SwitchCase.beforeJava17Switch(a);
		SwitchCase.java17Switch(a);
		

	}

}
