package com.shivam.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;

	public void setId(Integer adminUser) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
