package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.Picture;

public interface PictureDAO {
	public Picture addPicture(String image, Integer postId);
}
