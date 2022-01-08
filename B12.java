package com.OOPs;

class AB implements B12A, B12B{
	public void display() {
		System.out.println("Hello from method 1");
	}
	
}
public class B12 {
	public static void main(String[] args) {
		AB n = new AB();
		n.display();
	}

}
