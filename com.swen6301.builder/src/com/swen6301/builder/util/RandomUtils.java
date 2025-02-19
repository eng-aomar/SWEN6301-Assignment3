package com.swen6301.builder.util;

import java.util.Random;

public class RandomUtils {

	/**
	 * An instance of {@link Random} that will be used in generating random
	 * identifiers in encolsed methods.
	 */
	private final static Random RANDOM = new Random(System.currentTimeMillis());

	/**
	 * A private constructor to prevent accidental instantiations of this class.
	 */
	private RandomUtils() {
		throw new IllegalAccessError("Cannot instantiate instance for RandomUtils class");
	}

	/**
	 * Retrieves a randomized {@link String} of size between 5-10 and the first
	 * letter is capitalized.
	 * 
	 * @return A random {@link String}. The returned {@link String} could be
	 *         <code>null</code>.
	 */
	public static String randomIdentifier() {
		String lexicon = "abcdefghijklmnopqrstuvwxyz";
		int length = RANDOM.nextInt(6) + 5;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int position = RANDOM.nextInt(lexicon.length());
			char c = lexicon.charAt(position);
			if (i == 0) {
				c = Character.toUpperCase(c);
			}
			builder.append(c);
		}

		return builder.toString();
	}

	/**
	 * Generates a random number within the given <code>bound</code>.
	 * 
	 * @param bound An integer to bound the random generations (exclusive).
	 * @return An random number.
	 */
	public static int randomNumber(int bound) {
		int internalBound = 0;
		internalBound = RANDOM.nextInt(bound);
		if (internalBound > bound) {
			internalBound = bound;
		}

		else if (internalBound < 0) {
			internalBound = 0;
		}

		return internalBound;
	}

	/**
	 * Generates a random boolean.
	 * 
	 * @return a random boolean.
	 */
	public static boolean randomBoolean() {
		boolean internal_random =false;
		internal_random= RANDOM.nextBoolean();
		return internal_random;
	}

	/**
	 * Generates a random {@link String} for blood type.
	 * 
	 * @return a random blood type {@link enum}.
	 */
	public static BLOOD_TYPES randomBloodType() {
		BLOOD_TYPES internal_BloodTpes=null;
		internal_BloodTpes = BLOOD_TYPES.getRandom();
		return internal_BloodTpes;
	}

	/**
	 * Generates a random {@link String} for sex types.
	 * 
	 * @return a random sex type {@link String}.
	 */
	public static SEX_TYPES randomSexString() {
		SEX_TYPES internalSexTypes=null;
		internalSexTypes = SEX_TYPES.getRandom();
				return internalSexTypes;
	}

}
