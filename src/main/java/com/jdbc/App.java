package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.dao.StudentDaoImpl;
import com.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context =new ClassPathXmlApplicationContext("com/jdbc/config.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        StudentDaoImpl studentDaoImpl = context.getBean("studentDao",StudentDaoImpl.class);
//        Student student = new Student(3, "Tony Stark", "Bilaspur");
//        System.out.println(studentDaoImpl.saveStudent(student));
        studentDaoImpl.deleteStudent(2);
        
    }
}
