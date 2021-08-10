package com.kosa.myapp;

public interface IPatientService {
	
	void insertInfo(PatientVO patient);
	PatientVO getInfo(String name, String birthDate);
	void updateInfo(PatientVO patient);
	void deleteInfo(String name, String birthDate);
	int getPatientCount();

}
