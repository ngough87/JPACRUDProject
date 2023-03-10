package com.skilldistillery.projecttracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.projecttracker.data.ProjectTrackerDAO;
import com.skilldistillery.projecttracker.entities.ProjectTracker;

@Controller
public class ProjectTrackerController {
	@Autowired
	private ProjectTrackerDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goToHome(Model model) {
		return "home";
	}

	
	@RequestMapping(path= "create.do", method =RequestMethod.GET)
	public String createProject(ProjectTracker project, Model model ) {
		model.addAttribute("project", dao.create(project));
		return "createProject";
	}
	

	@RequestMapping(path="getProject.do", method=RequestMethod.GET)
	public String showProjects( Model model) {
		//ProjectTracker projects=dao.findAll());
		model.addAttribute("project", dao.findAll());
		return "allProjects";
	}
	
	@RequestMapping(path="projectDetails.do", method=RequestMethod.GET)
	public String projectDetails(@RequestParam int id, Model model) {
		
		model.addAttribute("project", dao.findById(id));
		return "projectDetails";
	}
	@RequestMapping(path="findById.do", method=RequestMethod.GET)
	public String findProjectById(@RequestParam int id, Model model) {
		
		model.addAttribute("project", dao.findById(id));
		return "projectDetails";
	}
	@RequestMapping(path="findByIdForUpdate.do", method=RequestMethod.GET)
	public String findProjectByIdForUpdate(@RequestParam int id, Model model) {
		
		model.addAttribute("project", dao.findById(id));
		return "projectUpdate";
	}
	
	
	
	@RequestMapping(path="update.do", method=RequestMethod.GET)
	public String updateProject( Model model) {
		return "projectUpdate";
	}
	
	@RequestMapping(path="updateForm.do", method=RequestMethod.GET)
	public String updateForm(@RequestParam int id, ProjectTracker project, Model model) {
		
		model.addAttribute("project", dao.update(id, project));
		return "projectUpdate";
	}
	@RequestMapping(path="deleteProject.do", method=RequestMethod.GET)
	public String deleteProject(@RequestParam int id, ProjectTracker project, Model model) {
		
		model.addAttribute("project", dao.delete(id));
		return "deletedProject";
	}
	@RequestMapping(path="email.do", method=RequestMethod.GET)
	public String savedProject(Model model) {
		return "email";
	}

	
	
	
}

