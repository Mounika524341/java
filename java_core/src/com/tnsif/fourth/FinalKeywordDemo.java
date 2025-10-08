package com.tnsif.fourth;



final class College {
 void showCollegeName() {
     System.out.println("College Name: Teegala krishna reddy College");
 }
}

class Student {
 final int studentId;
 final String studentName;
 Student(int id, String name) {
     studentId = id;
     studentName = name;
 }
 final void displayDetails() {
     System.out.println("Student ID: " + studentId);
     System.out.println("Student Name: " + studentName);
 }
}

public class FinalKeywordDemo {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Mounika");
     s1.displayDetails();
     College c1 = new College();
     c1.showCollegeName();
 }
}
