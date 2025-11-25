package com.demo;

public class GuardedPattern {

    public static void before17(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                System.out.println("Long");
            } else {
                System.out.println("Short");
            }
        } else {
            System.out.println("Something");
        }
    }

    public static void inJava17(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer");
            case String s when s.length() > 5 -> System.out.println("Long");
            case String s -> System.out.println("Short");
            default -> System.out.println("Something");
        }
    }

    public static void main(String[] args) {
        System.out.println("------Before 17------");
        before17("Gayathri");
        before17("Gayu");
        before17(100);

        System.out.println("------After 17 (Preview Feature)------");
        inJava17("Gayathri");
        inJava17("Gayu");
        inJava17(100);
    }
}
