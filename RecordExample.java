package com.demo;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

record PeopleRecord(String name, int age) { }

public class RecordExample {
    public static void main(String[] args) {
        System.out.println("----- Before 16 ------");
        Person p = new Person("Gayathri", 20);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p);

        System.out.println("----- After 16 ------");
        PeopleRecord p1 = new PeopleRecord("Gayathri", 20);
        System.out.println(p1.name());
        System.out.println(p1.age());
        System.out.println(p1);
    }
}
