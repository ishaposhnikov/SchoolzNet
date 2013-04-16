package org.hillel.it.schoolznet.model.dao;

import org.hillel.it.schoolznet.model.entity.FriendRequest;

public interface FriendRequestDAO {
	public boolean createFriendRequest(FriendRequest friendRequest);

	public boolean acceptFriendRequest(FriendRequest friendRequest);

	public boolean declineFriendRequest(FriendRequest friendRequest);

}
