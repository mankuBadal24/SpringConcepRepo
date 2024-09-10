package in.spdicc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spdicc.beans.Student;
import in.spdicc.resources.StudentConfig;

public class Main {
public static void main(String[] args) {
//	String config_path = "/in/spdicc/resources/applicationContext.xml";
//	@SuppressWarnings("resource")
//	ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
//	Student std = (Student) context.getBean("stdId");
	@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	Student std = (Student) context.getBean(Student.class);
	std.display(); 
}
}
