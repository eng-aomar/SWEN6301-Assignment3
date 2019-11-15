package com.swen6301.builder.util;

import java.util.Random;

public enum SEX_TYPES {
	MALE("male"), FEMALE("female"), none("none");
	String sex_types= null;

	SEX_TYPES(String sex) {
		sex_types = sex;
	}

	public String getSexType() {
		return sex_types;
	}
	public static SEX_TYPES getRandom() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}

}
