package com.skilldistillery.projecttracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.projecttracker.data.ProjectTrackerDAO;

@Controller
public class ProjectTrackerController {
	@Autowired
	private ProjectTrackerDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goToHome(Model model) {
		model.addAttribute("projectList", dao.findAll());
		return "home";
	}
}
