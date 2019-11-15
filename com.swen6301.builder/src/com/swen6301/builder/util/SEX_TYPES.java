package com.swen6301.builder.util;

import java.util.Random;

public enum SEX_TYPES {
	MALE("male"), FEMALE("female"), none("none");
	String sex_types= null;
/***
 * 
 * @param sex
 */
	SEX_TYPES(String sex) {
		sex_types = sex;
	}
/***
 * 
 * @return sex 
 */
	public String getSexType() {
		return sex_types;
	}
	/***
	 * 
	 * @return an enumeration of type SEX_TYPES using Random Library
	 */
	public static SEX_TYPES getRandom() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}

}
