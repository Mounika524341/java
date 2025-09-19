package com.tnsif.inheritance;

public class A {
	void dispaly1() {
		System.out.println("this is class A");
	}
	class B extends A{
		void display2() {
			System.out.println("this is class B");
		}
	}
	class C extends A{
		void dispay3() {
			System.out.println("this is class C");
		}
	}
	class D extends A{
		void display4() {
			System.out.println("this is class D");
		}
	}
}
