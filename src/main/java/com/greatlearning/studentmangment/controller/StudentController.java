package com.greatlearning.studentmangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.studentmangment.model.Student;
import com.greatlearning.studentmangment.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/list")
	public String listBooks(Model model) {
		List<Student> studentList = studentService.findAll();

		model.addAttribute("Students", studentList);

		return "list-students";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {

		Student student = new Student();
		model.addAttribute("Student", student);

		return "student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int studentId, Model model) {

		Student student = studentService.findById(studentId);

		model.addAttribute("Student", student);

		return "student-form";
	}

	@PostMapping("/save")
	public String saveBook(@RequestParam("studentId") int studentId, @RequestParam("name") String name,
			@RequestParam("department") String department,
			@RequestParam("country") String country) {

		Student student;
		if (studentId != 0) {
			student = studentService.findById(studentId);
			student.setName(name);
			student.setDepartment(department);
			student.setCountry(country);

		} else {
			student = new Student(name, department, country);
		}
		studentService.save(student);

		return "redirect:/student/list";
	}

	@RequestMapping("/delete")
	public String showFormForUpdate(@RequestParam("studentId") int studentId) {

		Student student = studentService.findById(studentId);

		studentService.deleteById(studentId);

		return "redirect:/student/list";
	}

}
