package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student){  
	    String query="INSERT INTO students (studentId, studentName, studentAddress) VALUES (?, ?, ?)";  
	    return jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentAddress());
	}  
	
	public int updateStudent(Student student) {
        String query = "UPDATE students SET studentName = ?, studentAddress = ? WHERE studentId = ?";
        return jdbcTemplate.update(query, student.getStudentName(), student.getStudentAddress(), student.getStudentId());
    }

    public int deleteStudent(int studentId) {
        String query = "DELETE FROM students WHERE studentId = ?";
        return jdbcTemplate.update(query, studentId);
    }
		
	

}
