package org.hillel.it.schoolznet.model.dao;

import java.util.Date;
import org.hillel.it.schoolznet.model.entity.*;
import java.util.List;

public interface UserDAO {
	public User login(String email, String password);

	public boolean registeration(String firstName, String secondName,
			String lastName, Date dateOfBirth, boolean sex, String email,
			String password, String employment, String picture);

	public boolean updatePassword(Integer personId, String oldPassword,
			String newPassword, String passwordConfirmation);

	public boolean updatePersonalInformation(Integer personId,
			String firstName, String secondName, String lastName,
			Date dateOfBirth, boolean sex, String email, String password,
			String employment, String picture);

	public List<User> unansweredFriendRequestsFor(Integer personId);

	public List<User> friendsFor(Integer personId);

	public User findById(Integer personId);

}
