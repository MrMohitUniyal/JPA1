package io.mohit.entityrelationship;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PersonId {
	
	@Id
	private int PanNum;
	private String LastName;
	
	@OneToOne(mappedBy = "id")
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPanNum() {
		return PanNum;
	}
	public void setPanNum(int panNum) {
		PanNum = panNum;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	@Override
	public String toString() {
		return this.getLastName() + " " + this.getPanNum();
	}
}
