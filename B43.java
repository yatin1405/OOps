package com.OOPs;

abstract class Parent1{
	public void message() {
		System.out.println("This is parent class");
	}
}
class Child1 extends Parent1{
	public void message() {
		System.out.println("This is first subclass");
	}
}
class Child2 extends Parent1{
	public void message() {
		System.out.println("This is second subclass");
	}
}
public class B43 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.message();
		c2.message();
	}

}
