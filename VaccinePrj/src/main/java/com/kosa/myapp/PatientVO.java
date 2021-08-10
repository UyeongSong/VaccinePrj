package com.kosa.myapp;

import java.sql.Date;

public class PatientVO {
	private String name;
	private java.sql.Date birthDate;
	private String phoneNum;
	private String gender;
	private String rotNum;
	private String firstDose;
	private String secondDose;
	private int patientId;
	
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.sql.Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(java.sql.Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNumber() {
		return phoneNum;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNum = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRotNumber() {
		return rotNum;
	}
	public void setRotNumber(String rotNumber) {
		this.rotNum = rotNumber;
	}
	public String getFirstDose() {
		return firstDose;
	}
	public void setFirstDose(String firstDose) {
		this.firstDose = firstDose;
	}
	public String getSecondDose() {
		return secondDose;
	}
	public void setSecondDose(String secondDose) {
		this.secondDose = secondDose;
	}
	@Override
	public String toString() {
		return "PatientVO [name=" + name + ", birthDate=" + birthDate + ", phoneNumber=" + phoneNum + ", gender="
				+ gender + ", rotNumber=" + rotNum + ", firstDose=" + firstDose + ", secondDose=" + secondDose + "]";
	}
	
	
	
}
