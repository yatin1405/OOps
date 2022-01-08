package com.OOPs;

import java.util.Scanner;

public class I3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks out of 100: ");
		int m = sc.nextInt();
		
		if(m>=91 && m<=100) {
			System.out.println("Your grade is: AA ");
		}
		else if(m>=81 && m<=90) {
			System.out.println("Your grade is: AB");
		}
		else if(m>=71 && m<=80) {
			System.out.println("Your grade is: BB");
		}
		else if(m>=61 && m<=70) {
			System.out.println("Your grade is: BC");
		}
		else if(m>=51 && m<=60) {
			System.out.println("Your grade is: CD");
		}
		else if(m>=41 && m<=50) {
			System.out.println("Your grade is: DD");
		}
		else if(m<=40) {
			System.out.println("You are fail");
		}
		else {
			System.out.println("Please enter marks between 0 to 100");
		}
	}

}
