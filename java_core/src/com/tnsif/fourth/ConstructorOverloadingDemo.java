package com.tnsif.fourth;

public class ConstructorOverloadingDemo {

 int id;
 String name;
 double salary;
 ConstructorOverloadingDemo() {
     System.out.println("Default constructor called");
     id = 0;
     name = "Not Assigned";
     salary = 0.0;
 }
 ConstructorOverloadingDemo(int i) {
     System.out.println("Constructor with one parameter called");
     id = i;
     name = "Unknown";
     salary = 0.0;
 }
 ConstructorOverloadingDemo(int i, String n) {
     System.out.println("Constructor with two parameters called");
     id = i;
     name = n;
     salary = 0.0;
 }
 ConstructorOverloadingDemo(int i, String n, double s) {
     System.out.println("Constructor with three parameters called");
     id = i;
     name = n;
     salary = s;
 }
 void display() {
     System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
 }

 public static void main(String[] args) {
     ConstructorOverloadingDemo emp1 = new ConstructorOverloadingDemo();
     ConstructorOverloadingDemo emp2 = new ConstructorOverloadingDemo(101);
     ConstructorOverloadingDemo emp3 = new ConstructorOverloadingDemo(102, "Mounika");
     ConstructorOverloadingDemo emp4 = new ConstructorOverloadingDemo(103, "Ajay", 50000.0);
     emp1.display();
     emp2.display();
     emp3.display();
     emp4.display();
 }
}


