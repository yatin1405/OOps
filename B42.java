package com.OOPs;

class Complex{
	double real;
	double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex Sum(Complex other) {
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary;
		return new Complex(r, i);
	}
	public Complex Difference(Complex other) {
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary;
		return new Complex(r, i);
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	@Override
	public String toString() {
		return real+" + "+imaginary+"i";
	}
}
public class B42 {
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 20);
		Complex c2 = new Complex(30, 40);
		Complex Sum = c1.Sum(c2);
		Complex Difference = c1.Difference(c2);
		
		System.out.println("First number: "+c1);
		System.out.println("Second number: "+c2);
		System.out.println("Sum number: "+Sum);
		System.out.println("Difference number: "+Difference);
		
	}

}
