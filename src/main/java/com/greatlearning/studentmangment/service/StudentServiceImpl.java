package com.greatlearning.studentmangment.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.studentmangment.model.Student;
import com.greatlearning.studentmangment.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public List<Student> findAll() {

		return studentRepository.findAll();
	}

	@Override
	public Student findById(int id) {

		return studentRepository.findById(id);
	}

	@Override
	public void save(Student student) {

		studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {

		studentRepository.deleteById(id);
	}

}
