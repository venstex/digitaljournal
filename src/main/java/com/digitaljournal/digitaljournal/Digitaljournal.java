package com.digitaljournal.digitaljournal;

import javax.persistence.Entity;

@Entity
public class Digitaljournal {

	long id;
	String project;
	public Digitaljournal(long id, String project) {
		super();
		this.id = id;
		this.project = project;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
}
