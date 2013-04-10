package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Video extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8393989375725804058L;
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
