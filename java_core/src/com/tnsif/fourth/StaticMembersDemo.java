package com.tnsif.fourth;
public class StaticMembersDemo {
 static String collegeName = "ABC College";
 int studentId;
 String studentName;
 StaticMembersDemo(int id, String name) {
     studentId = id;
     studentName = name;
 }
 static void changeCollegeName(String newName) {
     collegeName = newName;
 }
 void display() {
     System.out.println("ID: " + studentId + ", Name: " + studentName + ", College: " + collegeName);
 }
 public static void main(String[] args) {
     StaticMembersDemo s1 = new StaticMembersDemo(1, "Mounika");
     StaticMembersDemo s2 = new StaticMembersDemo(2, "Ajay");
     StaticMembersDemo s3 = new StaticMembersDemo(3, "Rikhil");
     System.out.println("Before changing college name:");
     s1.display();
     s2.display();
     s3.display();
     StaticMembersDemo.changeCollegeName("XYZ University");
     System.out.println("\nAfter changing college name:");
     s1.display();
     s2.display();
     s3.display();
 }
}
