package com.swen6301.builder;

import com.swen6301.builder.util.PersistenceUtils;
import com.swen6301.builder.util.RandomUtils;

/**
 * A dummy driver class that simulates a driver class for this project.
 */
public class Driver {
	
	public static void main(String[] args) {
		
		// Create 1000 random samples.
		for(int i = 0; i < 1000; i++) {
			System.out.println("****************");
			createRandomPatientInfo();
			System.out.println("****************");
		}
	}
	
	/**
	 * Creates a sample patient info and store them on internal storage.
	 */
	public static void createRandomPatientInfo() {
		/**String firstName = RandomUtils.randomIdentifier();
		String middleName = RandomUtils.randomIdentifier();
		String lastName = RandomUtils.randomIdentifier();
		int age = RandomUtils.randomNumber(150);
		int weight = RandomUtils.randomNumber(400);
		String sex = RandomUtils.randomSexString();
		int height = RandomUtils.randomNumber(300);
		boolean organDonor = RandomUtils.randomBoolean();
		String bloodType = RandomUtils.randomBloodType();
		boolean success = PersistenceUtils.storePatientInfo(firstName, middleName, lastName, age, weight, sex, height, organDonor, bloodType);
		if(success) {
			System.out.println("Patient [" + firstName + ", " + lastName + "] has been successfully processed!");
		} else {
			System.out.println("An error occurred while processing info for patient [" + firstName + ", " + lastName + "]!");
		} **/
		
		Patient patient = new Patient();
		Director director = new Director(patient);
		director.build();
		patient.getPatient();
	}
	
}
