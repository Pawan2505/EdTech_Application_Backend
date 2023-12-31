package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String title;
	private String description;
	private long duration;
	private long price;
	
	
	public Course(long id, String title, String description,long duration,long price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.price = price;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", price=" + price + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()="
				+ getDescription() + ", getDuration()=" + getDuration() + ", getPrice()=" + getPrice() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
