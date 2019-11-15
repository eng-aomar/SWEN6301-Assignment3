package com.swen6301.builder;
public class Patient {

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @param organDonor the organDonor to set
	 */
	public void setOrganDonor(boolean organDonor) {
		this.organDonor = organDonor;
	}

	/**
	 * @param bloodType the bloodType to set
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int weight;
	private String sex;
	private int height;
	private boolean organDonor;
	private String bloodType;

	/***
	 * Patient constructor, initialize variables for quality code
	 */
	public Patient() {
		this.age = 0;
		this.bloodType = null;
		this.firstName = "";
		this.height = 0;
		this.lastName = "";
		this.middleName = "";
		this.organDonor = false;
		this.sex = null;
		this.weight = 0;

	}
/***
 * 
 * @param firstName
 * @param middleName
 * @param lastName
 * @param age
 * @param weight
 * @param sex
 * @param height
 * @param organDonor
 * @param bloodType
 */
	public Patient(String firstName, String middleName, String lastName, int age, int weight, String sex, int height,
			boolean organDonor, String bloodType) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.height = height;
		this.organDonor = organDonor;
		this.bloodType = bloodType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @return the organDonor
	 */
	public boolean isOrganDonor() {
		return organDonor;
	}

	/**
	 * @return the bloodType
	 */
	public String getBloodType() {
		return bloodType;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient recored has been created successfully|\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient First Name: [" + getFirstName() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Middle Name: [" + getMiddleName() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Last Name: [" + getLastName() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Age: [" + getAge() + " Year]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Weight: [" + getWeight() + " kg]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Hieght: [" + getHeight() + " cm]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Blood Type: [" + getBloodType() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient Sex Type: [" + getSex() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		strBuilder.append("|Patient isDonor: [" + isOrganDonor() + "]\n");
		strBuilder.append("+---------------------------------------------+\n");
		return String.format(strBuilder.toString());
	}

}
