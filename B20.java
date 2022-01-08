package com.OOPs;
class A{
	private void display() {
		System.out.println("A.display");
	}
	public void callDisplay() {
		System.out.println("A.callDisplay");
		display();
	}
}
class B extends A{
	private void display() {
		System.out.println("B.display");
	}
	public void callDisplay() {
		System.out.println("B.callDisplay");
		display();
	}
}
public class B20 {
	public static void main(String[] args) {
		A a = new B();
		a.callDisplay();
		
		B b = new B();
		b.callDisplay();
		
		A a1 = new A();
		a1.callDisplay();
	}

}
