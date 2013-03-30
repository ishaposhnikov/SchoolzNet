package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Link implements Serializable {
	private int id;
	private String link;

	public Link() {
	}

	public Link(int id) {
		this.id = id;
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
