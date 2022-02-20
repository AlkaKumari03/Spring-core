package  com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    
        System.out.println( "My program started................!" );
        
        //spring jdbc=> jdbcTemplate
        
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        
        List<Student> students= studentDao.getAllStudents(); 
        for(Student s : students) {
        	System.out.println(s);
        }
        
        //one student data
//        Student student= studentDao.getStudent(60);
//        System.out.println(student);
//        
        // Delete 
//        int result = studentDao.delete(67);
//        System.out.println("Deleted " +result);
//        
        //update
//      Student student = new Student();
//      student.setId(6);
//      student.setName("Raj Kumar Rao");
//      student.setCity("Delhi");
//      
//     int result = studentdao.change(student);
//     System.out.println("data Changed " +result);
        
        
//        Student student=new Student();
//        student.setId(789);
//        student.setName("Alka");
//        student.setCity("Aurangabad");
//        
//        int result = studentdao.insert(student);
//        System.out.println("Student added"+result);
//        
        
        
        //JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        
        //String query="insert into student(id,name,city) values(?,?,?)";
        
        //fire query
        
        //int result = template.update(query, 6,"Anjali","Bihar");
        
        //System.out.println("Number of record inserted.." +result);
    }
}
