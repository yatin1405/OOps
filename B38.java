package com.OOPs;

class Parent{
	public void setParent() {
		System.out.println("This is a parent class");
	}
}
class Child extends Parent{
	public void setChild() {
		System.out.println("This is child class");
	}
}

public class B38 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.setParent();
		
		System.out.println();
		
		Child c = new Child();
		c.setParent();
		c.setChild();
		
		System.out.println();
		
		Parent pa = new Child();
		pa.setParent();
	}
}
