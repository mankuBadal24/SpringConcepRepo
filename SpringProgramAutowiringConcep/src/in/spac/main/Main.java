package in.spac.main;
 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spac.beans.Student;
//import in.spac.resources.StudentConfigFile;

public class Main {
public static void main(String[] args) {
//	@SuppressWarnings("resource")
//	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigFile.class);
//	Student std = (Student) context.getBean(Student.class);
//	std.display();
	
	
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("/in/spac/resources/applicationContext.xml");
	Student std = (Student) context.getBean("stdId");
	std.display();
}
}
