package com.swen6301.builder.util;

import java.io.Serializable;
import java.util.Random;

public enum BLOOD_TYPES implements Serializable {

	O_POS("O+"), O_NEG("O-"), A_POS("A+"), A_NEG("A-"), B_POS("B+"), B_NEG("B-"), AB_POS("AB+"), AB_NEG("AB-");

	String blood_Type= null;

	/***
	 * 
	 * @param bloodTypes
	 */
	BLOOD_TYPES(String bloodTypes) {
		blood_Type = bloodTypes;
	}

	/***
	 * 
	 * @return blood_Type
	 */
	public String getBloodType() {
		return blood_Type;
	}
	/***
	 * getRandom functions returns an enumeration of type BLOOD_TYPES using Random library
	 * @return
	 */

	public static BLOOD_TYPES getRandom() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}

}
