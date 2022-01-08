package com.OOPs;

class Parameter{
	public void setParameter(int a, char ch) {
		System.out.println(a+" "+ch);
	}
	public void setParameter(char ch, int a) {
		System.out.println(ch+" "+a);
	}
}

public class B36 {
	public static void main(String[] args) {
		Parameter pr = new Parameter();
		pr.setParameter(20, 'b');
		pr.setParameter('b', 20);
	}
}
