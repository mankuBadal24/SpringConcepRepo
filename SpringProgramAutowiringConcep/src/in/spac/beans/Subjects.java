package in.spac.beans;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

public class Subjects {
	
	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	private List<String> subjects;
	@Override
	public String toString() {
		
		return subjects.toString();
	}
}
