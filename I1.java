package com.OOPs;

class Facto{
	public int Factorial(int f) {
		if(f==0) {
			return 1;
		}
		return f*Factorial(f-1);

	}
}
public class I1 {
	public static void main(String[] args) {
		Facto f1 = new Facto();
		System.out.println(f1.Factorial(4));
		System.out.println(f1.Factorial(3));
		System.out.println(f1.Factorial(2));
		System.out.println(f1.Factorial(1));
		
	}

}
