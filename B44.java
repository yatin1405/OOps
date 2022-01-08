package com.OOPs;

abstract class Bank{
	abstract int getBalance();
}
class BankA extends Bank{

	private int balance;
	void deposit(int money) {
		balance += money;
	}
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
class BankB extends Bank {
	
	private int balance;
	void deposit(int money) {
		balance += money;
	}
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
class BankC extends Bank{

	private int balance;
	void deposit(int money) {
		balance += money;
	}
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
public class B44 {
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		a.deposit(100);
		b.deposit(150);
		c.deposit(200);
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
	}
}










