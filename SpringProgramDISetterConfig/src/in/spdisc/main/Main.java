package in.spdisc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spdisc.beans.Student;
import in.spdisc.resources.StudentConfig;

public class Main {
	public static void main(String[] args) {
//		this configuration is for XML config
//		String config_path = "/in/spdisc/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student std = (Student) context.getBean(Student.class);
		std.display();
	}
}
