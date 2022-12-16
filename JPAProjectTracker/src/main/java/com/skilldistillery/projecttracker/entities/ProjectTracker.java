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
	
	@Column(name="image_url")
	private String image_url;
	
	
	@Column(name="client_name")
	private String clientName;
	
	private String notes;

	@Column(name="point_of_contact")
	private String pointOfContact;
	
	
	public ProjectTracker() {}


	public ProjectTracker(int id, int projectNumber, String projectType, String image_url, String clientName,
			String notes, String pointOfContact) {
		super();
		this.id = id;
		this.projectNumber = projectNumber;
		this.projectType = projectType;
		this.image_url = image_url;
		this.clientName = clientName;
		this.notes = notes;
		this.pointOfContact = pointOfContact;
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


	public String getImage_url() {
		return image_url;
	}


	public void setImage_url(String image_url) {
		this.image_url = image_url;
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
				+ ", image_url=" + image_url + ", clientName=" + clientName + ", notes=" + notes + ", pointOfContact="
				+ pointOfContact + "]";
	}
	
	
	
	
	
}
