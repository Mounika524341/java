package com.tnsif.fifth;

interface Animal {
 void eat();
 void sleep();
}
interface Dog extends Animal {
 void bark();
}
class Puppy implements Dog {
 public void eat() {
     System.out.println("Puppy is eating...");
 }

 public void sleep() {
     System.out.println("Puppy is sleeping...");
 }
 public void bark() {
     System.out.println("Puppy is barking...");
 }
}

public class InterfaceInheritanceDemo {
 public static void main(String[] args) {
     Puppy p = new Puppy();
     p.eat();
     p.sleep();
     p.bark();
 }
}

