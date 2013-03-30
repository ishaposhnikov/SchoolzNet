package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.*;
import java.util.List;

public interface MessageDAO {

	public boolean createMessage(String title, String text, Integer sourceId,
			Integer destinationId, String picture, String video, String link);

	public List<Message> topTenFor(Integer personId);

}
