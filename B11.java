package com.OOPs;

class Over{
	public void display() {
		System.out.println("The First method is call");
	}
}
class Ride extends Over{
	public void display() {
		System.out.println("The second method is call");
	}
}
public class B11 {
	public static void main(String[] args) {
		Ride o = new Ride();
		o.display();
	}

}
