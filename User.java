package com.github.server.domain;


@Entity
@Table(name="users")
public class User {
	
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
