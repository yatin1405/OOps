package com.OOPs;

class Rectangle{
	int length, breadth;
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void Area() {
		int a=length*breadth;
		System.out.println(a);
	}
	public void Perimeter() {
		int p=2*(length+breadth);
		System.out.println(p);
	}
}
class Square extends Rectangle{
	public Square(int side) {
		super(side, side);
	}
	
}
public class B40 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(20, 10);
		r.Area();
		r.Perimeter();
		
		Square s = new Square(20);
		s.Area();
		s.Perimeter();
	}

}
