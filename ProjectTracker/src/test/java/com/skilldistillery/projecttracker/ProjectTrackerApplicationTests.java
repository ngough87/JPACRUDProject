package com.skilldistillery.projecttracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.projecttracker.entities.ProjectTracker;

@SpringBootTest
class ProjectTrackerApplicationTests {

	private static EntityManagerFactory emf;
	private EntityManager em;
	ProjectTracker project;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAProjectTracker");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	
	@BeforeEach
	void setUp() throws Exception {
	    em = emf.createEntityManager();
	    project =em.find(ProjectTracker.class,1);
	}

	@AfterEach
	void tearDown() throws Exception {
	    em.close();
	    project=null;
	}

	@Test
	void  test_Return_Project_Status_of_InProgress() {
	assertNotNull(project);
	assertEquals("NEW", project.getStatus().toString());
	
	}

}


