package com.OOPs;

class Triangle{
	int a, b, c;
	public double getarea() {
		double ab = (a+b+c)/2;
		return ab;
	}
	public double getPerimeter() {
		double abc = (a+b+c);
		return abc;
	}
}
public class B41 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.a=3;
		t.b=4;
		t.c=5;
		System.out.println("triangle area is: "+t.getarea());
		System.out.println("triangle perimeter is: "+t.getPerimeter());
	}

}
