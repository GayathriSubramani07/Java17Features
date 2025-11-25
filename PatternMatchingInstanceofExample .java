package com.demo;

public class PatternMatchingInstanceofExample {

    public static void beforeJava16(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // manual casting
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
    }

    public static void javaPatternMatching(Object obj) {
        if (obj instanceof String s) { // automatic casting
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
    }

    public static void main(String[] args) {
        beforeJava16("Gayathri");
        javaPatternMatching("Gayathri");
    }
}
