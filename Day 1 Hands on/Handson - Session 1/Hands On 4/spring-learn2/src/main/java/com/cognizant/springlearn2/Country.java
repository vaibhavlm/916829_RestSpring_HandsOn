package com.cognizant.springlearn2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	private String code;
	private String name;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	
	public Country() {
		LOGGER.info("Inside Country Class Constructor");
	}

	public String getCode() {
		LOGGER.info("Inside getCode function");
		return code;
	}

	public void setCode(String code) {
		LOGGER.info("Inside setCode function");
		this.code = code;
	}

	public String getName() {
		LOGGER.info("Inside getName function");
		return name;
	}

	public void setName(String name) {
		LOGGER.info("Inside setName function");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
	
}
