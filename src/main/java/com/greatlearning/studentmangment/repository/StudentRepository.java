package com.greatlearning.studentmangment.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.studentmangment.model.Student;

public interface StudentRepository {

	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}