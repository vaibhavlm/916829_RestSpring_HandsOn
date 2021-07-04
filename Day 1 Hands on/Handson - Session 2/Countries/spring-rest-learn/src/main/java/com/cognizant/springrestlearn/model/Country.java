package com.cognizant.springrestlearn.model;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;

	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	public Country() {
		LOGGER.debug("inside country constructor");
	}

	public String getCode() {
		LOGGER.debug("inside getCode function ");
		return code;
	}

	public void setCode(String code) {
		this.code = code;
		LOGGER.debug("inside setCode function");
	}

	public String getName() {
		LOGGER.debug("inside getName function");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		LOGGER.debug("inside setName function");
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
