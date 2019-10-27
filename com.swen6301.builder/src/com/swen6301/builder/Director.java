package com.swen6301.builder;

public class Director {
	
	private Patient patient ;
	public Director (Patient patient) {
		this.patient =patient;
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
		patient.setBooldType();
		
		}
}
