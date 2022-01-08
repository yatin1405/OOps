package com.OOPs;

class F{
	static int b=20;
	public static void display() {
		System.out.println(b);
	}
}
class G extends F{
	
}

public class B14 {
	
	public static void main(String[] args) {
		G g = new G();
		g.display();
		System.out.println(g.b);
		
	}

}
