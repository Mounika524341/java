package com.tnsif.fifth;

public class GetterSetterDemo {
 private int studentId;
 private String studentName;
 private double marks;
 public void setStudentId(int id) {
     studentId = id;
 }
 public int getStudentId() {
     return studentId;
 } 
 public void setStudentName(String name) {
     studentName = name;
 }
 public String getStudentName() {
     return studentName;
 }
 public void setMarks(double m) {
     marks = m;
 }
 public double getMarks() {
     return marks;
 }

 public static void main(String[] args) {
     GetterSetterDemo student = new GetterSetterDemo();
     student.setStudentId(101);
     student.setStudentName("Mounika");
     student.setMarks(92.5);
     System.out.println("Student ID: " + student.getStudentId());
     System.out.println("Student Name: " + student.getStudentName());
     System.out.println("Marks: " + student.getMarks());
 }
}
