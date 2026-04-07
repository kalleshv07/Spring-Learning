package edu.sp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.sp.bean")
//@ComponentScan({"edu.sp.bean" , "-------"}) // array store multiple paths
public class SpringConfig {
	
}
