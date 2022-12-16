package com.skilldistillery.projecttracker.data;

import java.util.List;

import com.skilldistillery.projecttracker.entities.ProjectTracker;

public interface ProjectTrackerDAO {

	ProjectTracker findById(int projectId);

	List<ProjectTracker> findAll();

	ProjectTracker create(ProjectTracker project);

	ProjectTracker update(int projectId, ProjectTracker project);

	Boolean delet(int projectId);

}
