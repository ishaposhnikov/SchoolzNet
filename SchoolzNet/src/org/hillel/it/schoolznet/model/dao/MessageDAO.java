package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.*;
import java.util.List;

public interface MessageDAO {

	public boolean createMessage(Message message);

	public List<Message> topTenFor(Integer personId);

}
