package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.Link;

public interface LinkDAO {
	public Link createLink(String link, Integer postId);
}
