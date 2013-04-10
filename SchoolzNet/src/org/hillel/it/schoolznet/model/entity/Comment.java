package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment extends Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1793669247995816013L;
	private int id;
	private String text;
	private Date date;
	private int destinationId;

	public Comment() {
	}

	public Comment(int id, String text, Date date, int destinationId) {
		this.id = id;
		this.text = text;
		this.date = date;
		this.destinationId = destinationId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

}
