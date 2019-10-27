package com.swen6301.builder.util;

import java.util.Random;

public enum SEX_TYPES {
	MALE, FEMALE,none;
	
	public static SEX_TYPES getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
