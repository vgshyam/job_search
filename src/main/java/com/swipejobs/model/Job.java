package com.swipejobs.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author shyam 25-Mar-2022 2:29:00 pm
 */

public class Job {

	private Boolean driverLicenseRequired;
	private List<String> requiredCertificates;
	private Map<String, String> location;
	private String billRate;
	private Integer workersRequired;
	private Date startDate;
	private String about;
	private String jobTitle;
	private String company;
	private String guid;
	private Integer jobId;

	/**
	 * @return the driverLicenseRequired
	 */
	public Boolean getDriverLicenseRequired() {
		return driverLicenseRequired;
	}

	/**
	 * @param driverLicenseRequired the driverLicenseRequired to set
	 */
	public void setDriverLicenseRequired(Boolean driverLicenseRequired) {
		this.driverLicenseRequired = driverLicenseRequired;
	}

	/**
	 * @return the requiredCertificates
	 */
	public List<String> getRequiredCertificates() {
		return requiredCertificates;
	}

	/**
	 * @param requiredCertificates the requiredCertificates to set
	 */
	public void setRequiredCertificates(List<String> requiredCertificates) {
		this.requiredCertificates = requiredCertificates;
	}

	/**
	 * @return the location
	 */
	public Map<String, String> getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Map<String, String> location) {
		this.location = location;
	}

	/**
	 * @return the billRate
	 */
	public String getBillRate() {
		return billRate;
	}

	/**
	 * @param billRate the billRate to set
	 */
	public void setBillRate(String billRate) {
		this.billRate = billRate;
	}

	/**
	 * @return the workersRequired
	 */
	public Integer getWorkersRequired() {
		return workersRequired;
	}

	/**
	 * @param workersRequired the workersRequired to set
	 */
	public void setWorkersRequired(Integer workersRequired) {
		this.workersRequired = workersRequired;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
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
	 * @return the jobId
	 */
	public Integer getJobId() {
		return jobId;
	}

	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

}
