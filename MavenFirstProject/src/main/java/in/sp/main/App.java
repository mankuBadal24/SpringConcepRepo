package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        Student std = (Student) context.getBean("stdId");
        std.display();
        
    }
}
