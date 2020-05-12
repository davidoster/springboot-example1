package org.afdemp.springbootexample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootExample1Application  extends SpringBootServletInitializer {

//        @Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SpringbootExample1Application.class);
//	}
        
	public static void main(String[] args) {
		SpringApplication.run(SpringbootExample1Application.class, args);
                
                System.out.println("Test");
	}

}
