package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.Video;

public interface VideoDAO {
	public Video addVideo(String link, Integer destinationId);
}
