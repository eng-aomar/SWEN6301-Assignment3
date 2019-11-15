package com.swen6301.builder;



/**
 * A dummy driver class that simulates a driver class for this project.
 */
public class Driver {
	
	public static void main(String[] args) {
		
		// Create 1000 random samples.
		for(int i = 0; i < 1000; i++) {
		
			createRandomPatientInfo();
			
		}
	}
	
	/**
	 * Creates a sample patient info and store them on internal storage.
	 */

	public static void createRandomPatientInfo() {

		PersonBuilder patient = new PatientBuilder();
		PersonDirector director = new PersonDirector(patient);
		director.build();
		director.getPatient();
	
	}
	
}
