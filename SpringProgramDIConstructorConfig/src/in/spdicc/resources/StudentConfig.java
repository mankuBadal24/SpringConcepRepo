package in.spdicc.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spdicc.beans.Address;
import in.spdicc.beans.Student;

@Configuration
public class StudentConfig {
	@Bean
	public Address createAddrObj() {
		Address addr = new Address(100, "Banglore", 530068);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student obj = new Student("Mayank", 35, createAddrObj());
		
		return obj;
	}
}
