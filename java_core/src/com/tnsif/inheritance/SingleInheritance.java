package com.tnsif.inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Single outer = new Single();
        Single.B obj = outer.new B();   // create inner-class object
        obj.display();
        System.out.println(obj.a);
        obj.show();
    }
}
