package com.skilldistillery.projecttracker.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.projecttracker.entities.ProjectTracker;

@Service
@Transactional
public class ProjectTrackerImpl implements ProjectTrackerDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ProjectTracker findById(int projectId) {
		return em.find(ProjectTracker.class, projectId);
	}

	@Override
	public List<ProjectTracker> findAll() {
		String jpql = "SELECT p FROM ProjectTracker p";
		return em.createQuery(jpql, ProjectTracker.class).getResultList();
	}

	@Override
	public ProjectTracker create(ProjectTracker project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTracker update(int projectId, ProjectTracker project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delet(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
