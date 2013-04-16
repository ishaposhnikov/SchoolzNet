package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.net.URL;

public class Picture extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2707298786246870933L;
	private URL url;

	public Picture() {
	}

	public Picture(int id, String image) {
	}

	public EntityType getEntityType() {
		return EntityType.PICTURE;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

}
