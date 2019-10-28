package com.swen6301.builder.util;

import java.io.Serializable;
import java.util.Random;

public enum BLOOD_TYPES implements Serializable  {

	O_POS,
	O_NEG,
	A_POS,
	A_NEG,
	B_POS,
	B_NEG,
	AB_POS,
	AB_NEG ;  
	public static BLOOD_TYPES getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }


}
