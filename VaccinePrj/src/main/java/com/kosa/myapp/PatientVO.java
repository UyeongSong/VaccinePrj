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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRotNum() {
		return rotNum;
	}
	public void setRotNum(String rotNum) {
		this.rotNum = rotNum;
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
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	@Override
	public String toString() {
		return "PatientVO [name=" + name + ", birthDate=" + birthDate + ", phoneNum=" + phoneNum + ", gender=" + gender
				+ ", rotNum=" + rotNum + ", firstDose=" + firstDose + ", secondDose=" + secondDose + ", patientId="
				+ patientId + "]";
	}
	
}
