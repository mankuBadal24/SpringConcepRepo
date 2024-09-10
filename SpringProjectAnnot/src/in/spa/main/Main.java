package in.spa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spa.beans.Student;
import in.spa.resources.SpringConfigFile;

public class Main {
	
public static void main(String[] args) {
	
//	this is xml configuration file code 
//	String resource_file_path = "/in/spa/resources/applicationContext.xml";
	@SuppressWarnings("resource")
//	ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
	
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
	Student std = (Student)context.getBean("student");
	std.display();
}
}
