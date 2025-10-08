package com.tnsif.sixth;

public class StringBufferBuilderDemo {
 public static void main(String[] args) {
     System.out.println("---- StringBuffer Example ----");
     StringBuffer sbf = new StringBuffer("Hello");
     System.out.println("Original StringBuffer: " + sbf);
     sbf.append(" World");
     System.out.println("After append: " + sbf);
     sbf.insert(5, " Java");
     System.out.println("After insert: " + sbf);
     sbf.replace(6, 10, "Programming");
     System.out.println("After replace: " + sbf);
     sbf.delete(0, 5);
     System.out.println("After delete: " + sbf);
     sbf.reverse();
     System.out.println("After reverse: " + sbf);
     System.out.println("\n---- StringBuilder Example ----");
     StringBuilder sbl = new StringBuilder("Welcome");
     System.out.println("Original StringBuilder: " + sbl);
     sbl.append(" to Java");
     System.out.println("After append: " + sbl);
     sbl.insert(7, " Programming");
     System.out.println("After insert: " + sbl);
     sbl.replace(0, 7, "Hello");
     System.out.println("After replace: " + sbl);
     sbl.delete(5, 17);
     System.out.println("After delete: " + sbl);
     sbl.reverse();
     System.out.println("After reverse: " + sbl);
 }
}

