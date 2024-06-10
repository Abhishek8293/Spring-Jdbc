package com.jdbc.dao;

import com.jdbc.entity.Student;

public interface StudentDao {

	int saveStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int studentId);
}
