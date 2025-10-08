package com.tnsif.inheritance;
class Vehicle {
	void displayVehicle() {
        System.out.println("This is a generic vehicle.");
    }
}
class Car extends Vehicle {
    void displayCar() {
        System.out.println("This is a car.");
    }
}
class Bus extends Vehicle {
    void displayBus() {
        System.out.println("This is a bus.");
    }
}
class SportsCar extends Car {
    void displaySportsCar() {
        System.out.println("This is a sports car.");
    }
}