package com.pavan.inotebookwithspring.models;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notes")
public class Notes {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false,unique = true)
	private String title;
	
	
	@Column(nullable = false)
	private String description;
	
	@Column(name="Time")
	private LocalTime currentTime = LocalTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(LocalTime currentTime) {
		this.currentTime = currentTime;
	}
     
   


}
