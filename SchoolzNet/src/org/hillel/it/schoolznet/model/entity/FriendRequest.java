package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.util.Date;

public class FriendRequest extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2720932715370437622L;
	private int id;
	private int sourceId;
	private int destinationId;
	private Date date;

	public FriendRequest() {

	}

	public FriendRequest(int id, int sourceId, int destinationId, Date date) {
		this.id = id;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.date = date;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
