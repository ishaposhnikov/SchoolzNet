package org.hillel.it.schoolznet.model.entity;

public class Album {
	private int id;
	private int name;
	private int multimediaCount;
	private String link;

	public Album() {

	}

	public Album(int id, int name, int multimediaCount, String link) {
		this.id = id;
		this.name = name;
		this.multimediaCount = multimediaCount;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getMultimediaCount() {
		return multimediaCount;
	}

	public void setMultimediaCount(int multimediaCount) {
		this.multimediaCount = multimediaCount;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
