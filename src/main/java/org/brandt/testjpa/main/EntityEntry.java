package org.brandt.testjpa.main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityEntry {

	@Id
	String id;
	
	String Name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}	
	
}
