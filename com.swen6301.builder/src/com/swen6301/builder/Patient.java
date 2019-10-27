package com.swen6301.builder;

import com.swen6301.builder.util.PersistenceUtils;
import com.swen6301.builder.util.RandomUtils;

public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int weight;
	private String sex;
	private int height;
	private boolean organDonor;
	private String bloodType ;
	
	
	public Patient() {
	}
	
	
	public Patient setFirstName() {
		// TODO Auto-generated method stub
		this.firstName =RandomUtils.randomIdentifier();
		return this;
	}


	public Patient setMiddleName() {
		// TODO Auto-generated method stub
		this.middleName = RandomUtils.randomIdentifier();
		return this;
	}

	
	public Patient setLastName() {
		// TODO Auto-generated method stub
		this.lastName = RandomUtils.randomIdentifier();
		return this;
	}

	
	public Patient setAge() {
		// TODO Auto-generated method stub
		this.age = RandomUtils.randomNumber(150);
		return this;
	}


	public Patient setWeight() {
		// TODO Auto-generated method stub
		this.weight = RandomUtils.randomNumber(400);
		return this;
	}

	
	public Patient setHeight() {
		// TODO Auto-generated method stub
		this.height = RandomUtils.randomNumber(300);
		return this;
	}


	public Patient setBooldType() {
		// TODO Auto-generated method stub
		
		this.bloodType =RandomUtils.randomBloodType();
		return this;
	}

	
	public Patient setSex() {
		// TODO Auto-generated method stub
		this.sex = RandomUtils.randomSexString();
		return this;
	}


	public Patient setOrganDonor() {
		// TODO Auto-generated method stub
		this.organDonor = RandomUtils.randomBoolean();
		return this;
	}

	
	public Patient getPatient() {
		// TODO Auto-generated method stub
		//return new Patient(firstName, middleName, lastName, age, weight, sex, height, organDonor, bloodType);
		boolean success = PersistenceUtils.storePatientInfo(firstName, middleName, lastName, age, weight, sex, height, organDonor, bloodType);
		if(success) {
			System.out.println("Patient [" + firstName + ", " + lastName + "] has been successfully processed!");
		} else {
			System.out.println("An error occurred while processing info for patient [" + firstName + ", " + lastName + "]!");
		}
		return this;
	}
	

	
	
	
}
