package com.tnsif.encapsule;

public class Encapsulations {

	public static void main(String[] args) {
	
		Encapsule ob = new Encapsule();
		System.out.println(ob.color);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		
		ob.start();
		ob.stop();

	}

}
