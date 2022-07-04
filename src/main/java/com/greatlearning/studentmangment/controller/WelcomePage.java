package com.greatlearning.studentmangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.studentmangment.model.Student;
import com.greatlearning.studentmangment.service.StudentService;

@Controller
public class WelcomePage {

	@RequestMapping("/")
	public String listBooks(Model model) {

		return "welcome-page";
	}

}
