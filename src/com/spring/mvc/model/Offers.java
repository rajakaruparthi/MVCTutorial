package com.spring.mvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offers {
	
	public int id;
	
	@Size(min=5, max=100, message="Size should be between 5 and 100")
	public String name;
	
	@NotNull
	@Pattern(regexp=".*\\@.*\\..*")
	public String email;
	
	@Size(min=5, max=100, message="Offer should be between 5 and 100")
	public String offer;
	
	public Offers() {
		
	}

	public Offers(int id, String name, String email, String offer) {
		this.name = name;
		this.email = email;
		this.offer = offer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "Offers [id=" + id + ", name=" + name + ", email=" + email + ", offer=" + offer + "]";
	}
	
}
