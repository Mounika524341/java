package com.tnsif.seventh;


public class ExceptionHandlingDemo {

 public static void main(String[] args) {

     System.out.println("Program started...\n");

     try {
         System.out.println("Inside outer try block");
         int result = 10 / 0;  
         System.out.println("Result: " + result);
         try {
             System.out.println("Inside nested try block");

             int[] arr = {1, 2, 3};
             System.out.println(arr[5]); 

         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Nested catch: Array index out of range");
         }

     } 
     catch (ArithmeticException e) {
         System.out.println("Outer catch 1: Cannot divide by zero!");
     } 
     catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Outer catch 2: Array index is invalid!");
     } 
     catch (Exception e) {
         System.out.println("Outer catch 3: General exception caught!");
     }

     System.out.println("\nProgram ended normally.");
 }
}
