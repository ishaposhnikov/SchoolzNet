package org.hillel.it.schoolznet.model.dao;

import java.util.List;

import org.hillel.it.schoolznet.model.entity.*;

public interface CommentDAO {
	public boolean createComment(String text, Integer sourceId,
			Integer destinationId);

	public List<Comment> commentsFor(Integer destinationId);

}
