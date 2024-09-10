package in.spdisc.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spdisc.beans.Address;
import in.spdisc.beans.Student;

@Configuration
public class StudentConfig {
		@Bean
		public Address createAddrObj() {
			Address addr = new  Address();
			addr.setHouseNo(100);
			addr.setCity("Delhi");
			addr.setPincode(110001);
			return addr;
		}
		
		@Bean
		public Student createStdObj() {
			Student obj = new Student();
			obj.setName("Mayank");
			obj.setRollno(27);
			obj.setAddress(createAddrObj());
			return obj;
		}
}
