package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Video implements Serializable {
	private int id;
	private String link;

	public Video() {
	}

	public Video(int id, String link) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
