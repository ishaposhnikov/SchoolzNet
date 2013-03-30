package org.hillel.it.schoolznet.model.dao;

public interface FriendRequestDAO {
	public boolean createFriendRequest(Integer sourceId, Integer destinationId);

	public boolean acceptFriendRequest(Integer sourceId, Integer destinationId);

	public boolean declineFriendRequest(Integer sourceId, Integer destinationId);

}
