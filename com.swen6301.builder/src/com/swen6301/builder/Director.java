package com.swen6301.builder;

public class Director {

	private PersonBuilder patient;

	public Director(PersonBuilder patient) {
		this.patient = patient;
	}
	 public Patient getPatient()
	 {
	  return this.patient.getPatient();
	 }
	 
	

	public void build() {
		patient.setAge();
		patient.setBooldType();
		patient.setFirstName();
		patient.setMiddleName();
		patient.setLastName();
		patient.setHeight();
		patient.setSex();
		patient.setWeight();
		patient.setOrganDonor();
	}
}
