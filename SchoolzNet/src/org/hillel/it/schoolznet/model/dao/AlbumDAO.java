package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.Picture;
import org.hillel.it.schoolznet.model.entity.Video;

public interface AlbumDAO {
	public Video addVideo(Video userVideo);

	public Picture addPicture(Picture userPicture);
	// stoit dobavitb basoviu klass dla video i kaptinok
	// public List<T> userMultimedia(Klass klass)
}
