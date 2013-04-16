package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Group extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3108059975195005771L;
	private String name;
	private String city;
	private String picture;
	private String status;

	public Group() {

	}

	public Group(int id, String name, String city, String picture, String status) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.picture = picture;
		this.status = status;
	}

	public EntityType getEntityType() {
		return EntityType.GROUP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
