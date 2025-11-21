package com.demo;

public class SwitchWithReturn {
	
	public static  String formatter(Object obj) {
		return switch(obj) {
		case Integer i->"Integer : "+i;
		case String s->"String :"+s;
		case Float f->"Float :"+f;
		case null->"Null";
		default -> "Unknown";
		
		};
		
	}
	
	
	public static String classifyNumber(Object obj) {
		 return switch(obj) {
		 case Integer i->i%2==0 ?"i is a even " : " i is a odd";
		 case Double d ->d > 0 ? "Possitive double":"Negative double";
		 default->"Unknow";
		 
		 };
	}
	
	public static void main(String[] args) {

		System.out.println(formatter(10));
		System.out.println(formatter("Gayathri"));
		System.out.println(formatter(10.3));
		System.out.println(formatter(null));
		System.out.println(formatter('c'));
		
		System.out.println(classifyNumber(10));
		System.out.println(classifyNumber("Gayathri"));
		System.out.println(classifyNumber(10.3));
		
		
	}

}
