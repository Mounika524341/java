package com.tnsif.sixth;
public class WrapperClassDemo {
 public static void main(String[] args) {
     int a = 10;
     Integer objA = a;   
     System.out.println("Auto-boxing: " + objA);
     Integer objB = 25;
     int b = objB;       
     System.out.println("Unboxing: " + b);
     Double objC = Double.valueOf(12.34);  // Boxing
     double c = objC.doubleValue();        // Unboxing
     System.out.println("Manual Boxing and Unboxing: " + c);
     Character ch = 'A';
     System.out.println("Character Wrapper: " + ch);
     Boolean flag = Boolean.TRUE;
     System.out.println("Boolean Wrapper: " + flag);
     String numStr = "100";
     int num = Integer.parseInt(numStr);         // String → int
     Integer numObj = Integer.valueOf(numStr);   // String → Integer object
     System.out.println("String to int: " + num);
     System.out.println("String to Integer object: " + numObj);
 }
}
