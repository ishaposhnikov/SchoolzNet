package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.net.URL;

public class Video extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8393989375725804058L;

	private URL url;

	public Video() {
	}

	public Video(int id, URL url) {

	}

	public EntityType getEntityType() {
		return EntityType.VIDEO;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

}
