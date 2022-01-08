package com.OOPs;

abstract class Marks{
	public abstract double getPercentage();
}
class A11 extends Marks{
	int a;
	int b;
	int c;
	public  A11(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public double getPercentage() {
		int total = (a+b+c)/3;
		return total;
	}
}
class B1 extends Marks{
	int a, b, c, d;
	public  B1(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	@Override
	public double getPercentage() {
		double total=(a+b+c+d)/4;
		return total;
	}
}
public class B45 {
	public static void main(String[] args) {
		A11 a = new A11(10, 20, 30);
		B1 b = new B1(40, 50, 60, 70);
		System.out.println(a.getPercentage());
		System.out.println(b.getPercentage());
	}

}
