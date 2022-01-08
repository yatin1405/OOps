package com.OOPs;

class A3{
	public static void setAB() {
		System.out.println("Parent");
	}
}
class B3 extends A3{
	public static void setAB() {
		System.out.println("Child");

	}
}
public class A2 {
	public static void main(String[] args) {
		A3 a3=new A3();
		a3.setAB();
		
		B3 b3=new B3();
		b3.setAB();
		
		A3 a33=new B3();
		a33.setAB();
	}

}
