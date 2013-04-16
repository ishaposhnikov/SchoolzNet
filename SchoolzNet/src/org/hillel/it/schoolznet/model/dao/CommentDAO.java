package org.hillel.it.schoolznet.model.dao;

import java.util.List;

import org.hillel.it.schoolznet.model.entity.*;

public interface CommentDAO {
	public boolean createComment(Comment comment);

	public List<Comment> commentsFor(Integer destinationId);

}
