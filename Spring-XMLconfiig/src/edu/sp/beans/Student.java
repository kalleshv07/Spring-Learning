package edu.sp.beans;

public class Student {
	String name;
	String roll;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+name );
		System.out.println("Roll no: "+roll );
		System.out.println("age: "+age);
	}
	
	
}
