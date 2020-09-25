package io.driverinfractionservice.policydriverinfractionservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Infraction {
	@Id
	@GeneratedValue
	private Long infractionID;
	private String licenseNumber;
	private String infractionNumber;
	private String infractionType;
	private Date accidentDate;
	
	public Infraction(){
		
	}	
	public Infraction(String licenseNumber, String infractionNumber,
			String infractionType, Date accidentDate) {
		super();
		this.licenseNumber = licenseNumber;
		this.infractionNumber = infractionNumber;
		this.infractionType = infractionType;
		this.accidentDate = accidentDate;
	}
	public String getInfractionNumber() {
		return infractionNumber;
	}
	public void setInfractionNumber(String infractionNumber) {
		this.infractionNumber = infractionNumber;
	}
	public String getInfractionType() {
		return infractionType;
	}
	public void setInfractionType(String infractionType) {
		this.infractionType = infractionType;
	}
	public Date getAccidentDate() {
		return accidentDate;
	}
	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}
	public Long getInfractionID() {
		return infractionID;
	}
	public void setInfractionID(Long infractionID) {
		this.infractionID = infractionID;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	
	

}
