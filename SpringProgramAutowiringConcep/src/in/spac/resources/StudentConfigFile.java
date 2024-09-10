package in.spac.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spac.beans.Address;
import in.spac.beans.Caste;
import in.spac.beans.Student;
import in.spac.beans.Subjects;

@Configuration
public class StudentConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseNo(420);
		addr.setCity("Amsterdam");
		addr.setState("Dutch capital");
		addr.setPincode(1008);
		return addr;
	}
	@Bean
	public Address createAddrObj1() {
		Address addr = new Address();
		addr.setHouseNo(426);
		addr.setCity("Ghaziabad");
		addr.setState("Uttar Pradesh");
		addr.setPincode(201001);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student obj = new Student();
		obj.setName("Mayank Badal");
		obj.setRollno(35);
//		obj.setSubjects(createSbjObj());
		
		return obj;
	}
	@Bean
	public Subjects createSbjObj() {
		Subjects sbj = new Subjects();
		List<String> subject_list = new ArrayList<String>();
		subject_list.add("JAVA ");
		subject_list.add("DSA");
		subject_list.add("Big Data");
		
		sbj.setSubjects(subject_list);
		return sbj;
	}
	@Bean
	public Caste createObj() {
		Caste ss = new Caste();
		ss.setCaste("OBC");
		return ss;
	}
}
