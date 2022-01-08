package com.OOPs;

class PrintNumber{
	void printn(int a) {
		System.out.println(a);
	}
	void printn(float a) {
		System.out.println(a);
	}
	void printn(double a) {
		System.out.println(a);
	}
	void printn(String a) {
		System.out.println(a);
	}
	void printn(char a) {
		System.out.println(a);
	}
}

public class B35 {
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		pn.printn(10);
		pn.printn(20.356f);
		pn.printn(56.897);
		pn.printn("Hello");
		pn.printn('Y');
		
	}

}
