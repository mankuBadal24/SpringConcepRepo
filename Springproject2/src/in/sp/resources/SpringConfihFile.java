package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfihFile {
	@Bean
 public Student stdId() {
	 Student std = new Student();
	 
	 std.setName("Mayank");
	 std.setRollNo(24);
	 std.setEmail("mayank@gmail.com");
	 
	 return  std;
 }
}
