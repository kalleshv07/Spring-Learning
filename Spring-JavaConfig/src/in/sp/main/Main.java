package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.Student;
import in.sp.configuration.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student s1=(Student) app.getBean("std1");
		
		s1.display();
	}

}
