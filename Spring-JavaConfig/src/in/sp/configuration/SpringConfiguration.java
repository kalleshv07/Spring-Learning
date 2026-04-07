package in.sp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Student;
@Configuration
public class SpringConfiguration {
	
	
	@Bean
	public Student std1() {
		Student s1 = new Student();
		
		s1.setName("KV");
		s1.setAge(22);
		s1.setRoll("4BD21IS045");
		
		return s1;
	}
}
