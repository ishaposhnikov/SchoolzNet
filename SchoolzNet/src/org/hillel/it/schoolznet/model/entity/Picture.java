package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Picture implements Serializable {
	private int id;
	private String image;

	public Picture() {
	}

	public Picture(int id, String image) {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
