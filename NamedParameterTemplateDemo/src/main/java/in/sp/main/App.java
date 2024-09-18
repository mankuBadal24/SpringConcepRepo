package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        NamedParameterJdbcTemplate npjdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
       
         Map<String , Object> map = new HashMap<String, Object>();
         map.put("key_rollno", 104);
         map.put("key_name","Mayank");
         map.put("key_marks", 88.9f);
        
        String insert_query_sql = "insert into student values(:key_rollno, :key_name, :key_marks)";
       
        int count = npjdbcTemplate.update(insert_query_sql, map);
        if(count >0) {
        	System.out.println("data inserted successfully");
        }else {
        	System.out.println("failed");
        }
    }
}
