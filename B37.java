package com.OOPs;

class Area{
	public void RArea(int l, int w) {
		int RecArea = l*w;
		System.out.println(RecArea);
	}
	public void RArea(int l) {
		int SquArea = l*l;
		System.out.println(SquArea);
	}
}

public class B37 {
	public static void main(String[] args) {
		Area a = new Area();
		a.RArea(20, 30);
		a.RArea(20);
	}
}
