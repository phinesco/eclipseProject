package com.richoco.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Student student = (Student) context.getBean("studentbean");
		
		// Calling the displayInfo() method in Student class
		student.displayInfo();
		((AbstractApplicationContext) context).close();
	
	}

}
