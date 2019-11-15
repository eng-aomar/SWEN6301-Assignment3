package com.swen6301.builder;


import com.swen6301.builder.util.PersistenceUtils;
import com.swen6301.builder.util.RandomUtils;


/**
 * The builder abstraction.
 */
public class PatientBuilder extends PersonBuilder {

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int weight;
	private String sex;
	private int height;
	private boolean organDonor;
	private String bloodType;
	private Patient patient;

	public PatientBuilder() {
		patient = new Patient();
	}

	public PatientBuilder setFirstName() {
		// TODO Auto-generated method stub
		this.firstName = RandomUtils.randomIdentifier();
		patient.setFirstName(firstName);
		return this;
	}

	public PatientBuilder setMiddleName() {
		// TODO Auto-generated method stub
		this.middleName = RandomUtils.randomIdentifier();
		patient.setMiddleName(middleName);
		return this;
	}

	public PatientBuilder setLastName() {
		// TODO Auto-generated method stub
		this.lastName = RandomUtils.randomIdentifier();
		patient.setLastName(lastName);
		return this;
	}

	public PatientBuilder setAge() {
		// TODO Auto-generated method stub
		this.age = RandomUtils.randomNumber(120);
		patient.setAge(age);
		return this;
	}

	public PatientBuilder setWeight() {
		// TODO Auto-generated method stub
		this.weight = RandomUtils.randomNumber(300);
		patient.setWeight(weight);
		return this;
	}

	public PatientBuilder setHeight() {
		// TODO Auto-generated method stub
		this.height = RandomUtils.randomNumber(250);
		patient.setHeight(height);
		return this;
	}

	public PatientBuilder setBooldType() {
		// TODO Auto-generated method stub

		this.bloodType = RandomUtils.randomBloodType().getBloodType();
		patient.setBloodType(bloodType);
		return this;
	}

	public PatientBuilder setSex() {
		// TODO Auto-generated method stub
		this.sex = RandomUtils.randomSexString().getSexType();
		patient.setSex(sex);
		return this;
	}

	public PatientBuilder setOrganDonor() {
		// TODO Auto-generated method stub
		this.organDonor = RandomUtils.randomBoolean();
		patient.setOrganDonor(organDonor);
		return this;
	}

	public Patient getPatient() {
		// TODO Auto-generated method stub

		boolean success = PersistenceUtils.storePatientInfo(firstName, middleName, lastName, age, weight, sex, height,
				organDonor, bloodType);
		if (success) {
			System.out.println(patient);

		} else {
			System.out.println(
					"An error occurred while processing info for patient [" + firstName + ", " + lastName + "]!");
		}

		return patient;

	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
