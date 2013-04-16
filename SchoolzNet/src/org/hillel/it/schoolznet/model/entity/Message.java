package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Message extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4396542563594490324L;
	private String title;
	private String text;
	private Date date;
	private String destinationId;

	public Message() {

	}

	public Message(int id, String title, String text, Date date,
			String destinationId) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.date = date;
		this.destinationId = destinationId;
	}

	public EntityType getEntityType() {
		return EntityType.MESSAGE;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

}
