package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.net.URL;

public class Album extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7759616943006038721L;
	private int name;
	private int multimediaCount;
	private URL url;

	public Album() {

	}

	public Album(int id, int name, int multimediaCount, URL url) {
		this.id = id;
		this.name = name;
		this.multimediaCount = multimediaCount;
		this.url = url;
	}

	public EntityType getEntityType() {
		return EntityType.ALBUM;
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

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

}
