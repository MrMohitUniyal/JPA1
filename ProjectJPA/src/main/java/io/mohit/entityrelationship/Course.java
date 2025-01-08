package io.mohit.entityrelationship;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
	public class Course {

	    @Id
	    private int courseid;

	    private String courseFame;

	    // Other fields and relationships
	    @ManyToOne
	    private Person person;
	    

	    public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		// Getters and setters
	    public int getCourseid() {
	        return courseid;
	    }

	    public void setCourseid(int courseid) {
	        this.courseid = courseid;
	    }

	    public String getCourseName() {
	        return courseFame;
	    }

	    public void setCourseName(String courseFame) {
	        this.courseFame = courseFame;
	    }
	    
	    @Override
	    public String toString() {
	    	return this.getCourseName() + " " + this.getCourseid() + " " + this.getPerson().getName();
	    }
	}


