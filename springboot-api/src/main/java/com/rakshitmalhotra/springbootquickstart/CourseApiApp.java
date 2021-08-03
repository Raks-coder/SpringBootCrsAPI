package com.rakshitmalhotra.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * So, what is happening here? What is @SpringBootApplication?
 * 
 * It is the annotation used to tell spring boot about the main method.
 * It also performs the following functions:-
 * 
 * 	Setup default configurations (Addresses that 80% use case construct)
 *  Starts Spring application context 
 *  Performs Class-path Scan	
 *  Starts tomcat server (default port 8080)
 * */



@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

}
