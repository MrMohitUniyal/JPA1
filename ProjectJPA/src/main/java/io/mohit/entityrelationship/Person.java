package io.mohit.entityrelationship;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	private String name;
	@Id
	private int number;
	
	@OneToOne
	private PersonId id;
	
	@OneToMany(mappedBy = "person")
	private List<Course> courseList;
	
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public PersonId getId() {
		return id;
	}
	public void setId(PersonId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return this.getName() + " " + this.getNumber() + " " + this.getId().getPanNum();
	}
}
