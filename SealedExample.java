package com.demo;

sealed class Vehicle permits Car, Bike {
    void info() {
        System.out.println("This is a vehicle");
    }
}

final class Car extends Vehicle {
    void show() {
        System.out.println("This is a car - uses petrol and diesel");
    }
}

non-sealed class Bike extends Vehicle {
    void show() {
        System.out.println("This is a bike - uses petrol");
    }
}

// class Bus extends Vehicle { }  // ❌ Not allowed — not in permits list

public class SealedExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.info();
        v2.info();
    }
}
