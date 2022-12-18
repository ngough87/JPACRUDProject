package com.skilldistillery.projecttracker.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
	public ProjectTracker findById(int id) {
	
		return em.find(ProjectTracker.class, id);
	}

	@Override
	public List<ProjectTracker> findAll() {
		String jpql = "SELECT p FROM ProjectTracker p";
		return em.createQuery(jpql, ProjectTracker.class).getResultList();
	}

	@Override
	public ProjectTracker create(ProjectTracker project) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPAProjectTracker");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(project);
		
		em.flush();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		return project;
	}

	@Override
	public ProjectTracker update(int id, ProjectTracker project) {
		ProjectTracker updatedProject=em.find(ProjectTracker.class, id);	
		
		updatedProject.setProjectNumber(project.getProjectNumber());
		updatedProject.setProjectType(project.getProjectType());
		updatedProject.setClientName(project.getClientName());
		updatedProject.setStatus(project.getStatus());
		updatedProject.setPointOfContact(project.getPointOfContact());
		updatedProject.setLastUpdated(project.getLastUpdated());
		
		
		return project;
	}

	@Override
	public Boolean delete(int projectId) {
		return null;
	}

}
