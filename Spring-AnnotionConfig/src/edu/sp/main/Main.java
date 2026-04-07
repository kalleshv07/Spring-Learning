package edu.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sp.bean.Student;
import edu.sp.config.SpringConfig;

public class Main {
	public static void main(String[] args) {
		
//		String path = "edu/sp/resources/applicationContext.xml";
//		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student s1= (Student) app.getBean("student");
		
		s1.display();
	}
}
