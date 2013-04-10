package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Album extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7759616943006038721L;
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
