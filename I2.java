package com.OOPs;

abstract class Shape{
	public abstract int RectangleArea(int l, int b);
	public abstract int SquareArea(int s);
	public abstract int CircleArea(int r);
}
class Area1 extends Shape{

	@Override
	public int RectangleArea(int l, int b) {
		int ra = l*b;
		return ra;
	}

	@Override
	public int SquareArea(int s) {
		int sa = s*s;
		return sa;
	}

	@Override
	public int CircleArea(int r) {
		int ca = (int) (Math.PI*r*r);
		return ca;
	}
	
}
public class I2 {
	public static void main(String[] args) {
		Area1 a=new Area1();
		System.out.println("The ractangle area is: "+a.RectangleArea(10, 20));
		System.out.println("The square area is: "+a.SquareArea(10));
		System.out.println("The circle area is: "+a.CircleArea(20));
	}

}
