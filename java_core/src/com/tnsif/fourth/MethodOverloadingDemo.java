package com.tnsif.fourth;



public class MethodOverloadingDemo {
	void display(int a, float b) {
		System.out.println("Method 1: int and float parameters");
	    System.out.println("a = " + a + ", b = " + b);
	    }
	 void display(float a, int b) {
		 System.out.println("Method 2: float and int parameters (different sequence)");
	     System.out.println("a = " + a + ", b = " + b);
	    }

	   
	    void display(double a, double b) {
	        System.out.println("Method 3: double parameters (different data type)");
	        System.out.println("a = " + a + ", b = " + b);
	    }

	    public static void main(String[] args) {
	        MethodOverloadingDemo obj = new MethodOverloadingDemo();

	        // Calling methods with different types and sequences
	        obj.display(10, 5.5f);      // Calls method 1
	        obj.display(4.5f, 20);      // Calls method 2
	        obj.display(3.14, 6.28);    // Calls method 3
	    }
	}



