package com.greatlearning.studentmangment.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.studentmangment.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private SessionFactory sessionFactory;

	private Session session;

	StudentRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public List<Student> findAll() {

		Transaction tx = session.beginTransaction();

		List<Student> studentList = session.createQuery("from Student").list();

		tx.commit();

		return studentList;
	}

	@Override
	@Transactional
	public Student findById(int id) {

		Student student = new Student();

		Transaction tx = session.beginTransaction();

		student = session.get(Student.class, id);

		tx.commit();

		return student;
	}

	@Override
	@Transactional
	public void save(Student student) {

		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(student);

		tx.commit();
	}

	@Override
	@Transactional
	public void deleteById(int id) {

		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, id);

		session.delete(student);

		tx.commit();
	}

}
