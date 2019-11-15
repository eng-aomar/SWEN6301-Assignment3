package com.swen6301.builder;

public abstract class PersonBuilder {
	
	public 	PersonBuilder() {
	}
	public abstract PersonBuilder setFirstName();
	public abstract PersonBuilder setMiddleName();
	public abstract PersonBuilder setLastName();
	public abstract PersonBuilder setAge();
	public abstract PersonBuilder setWeight();
	public abstract PersonBuilder setHeight();
	public abstract PersonBuilder setBooldType();
	public abstract PersonBuilder setSex();
	public abstract PersonBuilder setOrganDonor();
	protected abstract Patient getPatient();
	}
