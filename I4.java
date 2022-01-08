package com.OOPs;

class Shape2{
	public void setShape2() {
		System.out.println("This is shape2");
	}
}
class Rectangle2 extends Shape2{
	public void setRactangle2() {
		System.out.println("This is rectangular shape");
	}
}
class Circle2 extends Shape2{
	public void setCircle2() {
		System.out.println("This is circuler shape");
	}
}
class Square2 extends Rectangle2{
	public void setSquare() {
		System.out.println("Square is a rectangle");
	}
}
public class I4 {
	public static void main(String[] args) {
		Square2 sq = new Square2();
		sq.setShape2();
		sq.setRactangle2();
	}

}
