package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;

public class Comment extends Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1793669247995816013L;
	private String text;
	private int destinationId;

	public Comment() {
	}

	public Comment(int id, String text, int destinationId) {
		this.id = id;
		this.text = text;
		this.destinationId = destinationId;
	}

	public EntityType getEntityType() {
		return EntityType.COMMENT;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

}
