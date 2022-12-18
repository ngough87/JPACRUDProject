package com.skilldistillery.projecttracker.data;

import java.util.List;

import com.skilldistillery.projecttracker.entities.ProjectTracker;

public interface ProjectTrackerDAO {

	ProjectTracker findById(int id);

	List<ProjectTracker> findAll();

	ProjectTracker create(ProjectTracker project);

	ProjectTracker update(int id, ProjectTracker project);

	public boolean delete(int id);

	

}
