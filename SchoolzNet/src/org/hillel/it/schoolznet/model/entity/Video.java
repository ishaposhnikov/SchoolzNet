package org.hillel.it.schoolznet.model.entity;

public class Video {
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
