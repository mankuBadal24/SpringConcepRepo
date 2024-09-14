package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowmapper;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        
      
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//      -------------------------  Insert Operation -----------------------------------------
//        String std_roll = "103";
//        String std_name = "Mala";
//        float std_marks = 94.5f;
//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//       int count = jdbcTemplate.update(insert_sql_query, std_roll, std_name, std_marks);
//       
//       if(count>0) {
//    	   System.out.println("insertion Success");
//       }else {
//    	   System.out.println("Insertion fail");
//    }
        
        
//       -------------------------- Update Operation ---------------------------------------
//        float marks = 98.3f;
//        int rollno = 101;
//        
//        String update_sql_query = "Update student set std_marks=? where std_roll=?";
//        int count = jdbcTemplate.update(update_sql_query, marks, rollno);
//        if(count >0) {
//        	System.out.println("update sucess");
//        }else {
//        	System.out.println("update failed");
//        }
        
        
//       ---------------------------- Delete Operation ----------------------------------------
//        	int rollno = 101;
//        	String delete_sql_query = "delete from student where std_roll=?";
//        	int count = jdbcTemplate.update(delete_sql_query, rollno);
//        	if(count >0) {
//        		System.out.println("delete sucess");
//        	}else {
//        		System.out.println("delete failed");
//        	}
        
        
        
//       	--------------------------- Select Operation ----------------------------------------
        int rollno = 102;
        String select_sql_query = "select * from student where std_roll =?";
        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowmapper(),rollno);
        for(Student std : std_list) {
        	System.out.println("Name is : "+std.getName());
        	System.out.println("Roll no. is  : "+std.getRollno());
        	System.out.println("Marks is : "+std.getMarks());
        	System.out.println("-----------------------------");
        }
       }
    } 
