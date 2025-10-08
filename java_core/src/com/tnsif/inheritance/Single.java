package com.tnsif.inheritance;

public class Single {
    int a = 10;
    public void show() {
        System.out.println("this is class A");
    }

    public class B extends Single {
        public void display() {
            System.out.println("this is class B");
        }
    }
}
