package org.hillel.it.schoolznet.model.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User extends Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8146287963790784430L;
	private String firstName;
	private String secondName;
	private String lastName;
	private boolean sex;
	private String email;
	private String password;
	private String picture;
	private String education;
	private String employment;
	private String status;
	private String city;
	private Date dateOfBirth;

	public User() {
	}

	public User(int id, String firstName, String lastName, boolean sex,
			String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.email = email;
		this.password = password;

	}

	public EntityType getEntityType() {
		return EntityType.USER;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmployment() {
		return employment;
	}

	public void setEmployment(String employment) {
		this.employment = employment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFormattedDateOfBirth() {
		if (dateOfBirth == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		return formatter.format(dateOfBirth);
	}

	public String getFormattedDayOfBirth() {
		if (dateOfBirth == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		return formatter.format(dateOfBirth);
	}

	public String getFormattedMonthOfBirth() {
		if (dateOfBirth == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat("MMM");
		return formatter.format(dateOfBirth);
	}

	public String getFormattedYearOfBirth() {
		if (dateOfBirth == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		return formatter.format(dateOfBirth);
	}

}
