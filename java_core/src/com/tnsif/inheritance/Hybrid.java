package com.tnsif.inheritance;

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar mySportsCar = new SportsCar();
		mySportsCar.displayVehicle(); // Inherited from Vehicle
        mySportsCar.displayCar();     // Inherited from Car
        mySportsCar.displaySportsCar(); // Its own method

	}

}
