package edu.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "edu/sp/resources/applicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		
		Student std1 =(Student) app.getBean("std1");
		
		std1.display();
	}

}
 