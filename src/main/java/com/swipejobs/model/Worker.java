package com.swipejobs.model;

import java.util.List;
import java.util.Map;

/**
 * @author shyam 25-Mar-2022 2:32:36 pm
 */

public class Worker {

	private Integer rating;
	private Boolean isActive;
	private List<String> certificates;
	private List<String> skills;
	private Map<String, String> jobSearchAddress;

	private String transportation;
	private Boolean hasDriversLicense;
	private List<Object> availability;
	private String phone;
	private String email;
	private Map<String, String> name;
	private Integer age;
	private String guid;
	private Integer userId;

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the certificates
	 */
	public List<String> getCertificates() {
		return certificates;
	}

	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	/**
	 * @return the skills
	 */
	public List<String> getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	/**
	 * @return the jobSearchAddress
	 */
	public Map<String, String> getJobSearchAddress() {
		return jobSearchAddress;
	}

	/**
	 * @param jobSearchAddress the jobSearchAddress to set
	 */
	public void setJobSearchAddress(Map<String, String> jobSearchAddress) {
		this.jobSearchAddress = jobSearchAddress;
	}

	/**
	 * @return the transportation
	 */
	public String getTransportation() {
		return transportation;
	}

	/**
	 * @param transportation the transportation to set
	 */
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	/**
	 * @return the hasDriversLicense
	 */
	public Boolean getHasDriversLicense() {
		return hasDriversLicense;
	}

	/**
	 * @param hasDriversLicense the hasDriversLicense to set
	 */
	public void setHasDriversLicense(Boolean hasDriversLicense) {
		this.hasDriversLicense = hasDriversLicense;
	}

	/**
	 * @return the availability
	 */
	public List<Object> getAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(List<Object> availability) {
		this.availability = availability;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public Map<String, String> getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Map<String, String> name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
