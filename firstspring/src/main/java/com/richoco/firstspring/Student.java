package com.richoco.firstspring;
// Writing A Spring App. to output the student's name and student's age
// given in the bean file.
public class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayInfo(){
		System.out.println("Hello: " + name + " You are " +age + " years old");
	}

}
