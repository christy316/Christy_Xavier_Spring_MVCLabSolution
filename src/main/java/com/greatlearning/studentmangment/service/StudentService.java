package com.greatlearning.studentmangment.service;

import java.util.List;

import com.greatlearning.studentmangment.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}