package com.OOPs;


class Member{
	 String name;
	 int age;
	 long phonenumber;
	 String address;
	 int salary;
	public Member(String name, int age, long phonenumber, String address, int salary) {
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	public void printSalary() {
		System.out.println("salary is: "+salary);
	}
}
class Employee extends Member{
	String specialization;
	public Employee(String name, int age, long phonenumber, String address, 
					int salary, String specialization) {
		super(name, age, phonenumber, address, salary);
		this.specialization = specialization;
		
	}
}
class Manager extends Member{
	String department;
	public Manager(String name, int age, long phonenumber, String address, 
					int salary, String department) {
		super(name, age, phonenumber, address, salary);
		this.department = department;
		
	}
}

public class B39 {
	public static void main(String[] args) {
		Employee e = new Employee("yatin", 24, 95864478, "umiyanagar", 15000, "java");
		Manager m = new Manager("jay", 25, 58647, "thaltej", 51000, "job");
		e.printSalary();
		m.printSalary();
	}

}
