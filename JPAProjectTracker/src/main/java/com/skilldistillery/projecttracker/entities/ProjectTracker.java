package com.skilldistillery.projecttracker.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_tracker")
public class ProjectTracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="project_number")
	private int projectNumber;
	
	@Column(name="project_type")
	private String projectType;

	
	
	@Column(name="client")
	private String clientName;
	
	private String status;

	@Column(name="point_of_contact")
	private String pointOfContact;
	
	private String notes;
	
	@Column(name="last_updated")
	private String lastUpdated;
	
	public ProjectTracker() {}


	

	public ProjectTracker(int id, int projectNumber, String projectType, String clientName, String status,
			String pointOfContact, String notes, String lastUpdated) {
		super();
		this.id = id;
		this.projectNumber = projectNumber;
		this.projectType = projectType;
		this.clientName = clientName;
		this.status = status;
		this.pointOfContact = pointOfContact;
		this.notes = notes;
		this.lastUpdated = lastUpdated;
	}








	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getProjectNumber() {
		return projectNumber;
	}


	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}


	public String getProjectType() {
		return projectType;
	}


	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}



	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getPointOfContact() {
		return pointOfContact;
	}


	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getLastUpdated() {
		return lastUpdated;
	}




	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}




	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectTracker other = (ProjectTracker) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "ProjectTracker [id=" + id + ", projectNumber=" + projectNumber + ", projectType=" + projectType
				+ ", clientName=" + clientName + ", status=" + status + ", pointOfContact=" + pointOfContact
				+ ", notes=" + notes + ", lastUpdated=" + lastUpdated + "]";
	}
	
	
	
	
	
}
