package com.demo;

public class SwitchWithMultipleCase {

    // ---------------- BEFORE JAVA 17 ----------------
    public static void beforeJava17(int a) {

        switch (a) {

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            // Fall-through WILL happen here.
            // If the input is 3:
            // → It checks case 3
            // → Falls through case 4
            // → Falls through case 5
            // → Executes the print statements once
            case 3:
            case 4:
            case 5:
                System.out.println("three, four, five");
                break;

            // Braces {} are OPTIONAL here
            // Without {} also it will work
            case 6:
            case 7:
            case 8: {
                System.out.println("six, seven, eight");
                System.out.println("six, seven, eight");
                break;
            }
        }
    }


    // ---------------- AFTER JAVA 17 ----------------
    public static void afterJava17(int a) {

        switch (a) {

            case 1 -> System.out.println("one");

            case 2 -> System.out.println("two");

            // No fall-through happens here.
            // If input is 3:
            // → It checks only case 3
            // → It does NOT check case 4 or 5
            case 3, 4, 5 -> {
                // If we have more than one statement, {} is REQUIRED
                System.out.println("three, four, five");
                System.out.println("multiple statements in Java 17");
            }

            // Single statement → {} NOT required
            case 6, 7, 8 -> System.out.println("six, seven, eight");
        }
    }


    public static void main(String[] args) {
        System.out.println("Before Java 17:");
        beforeJava17(3);

        System.out.println("After Java 17:");
        afterJava17(3);
    }
}
