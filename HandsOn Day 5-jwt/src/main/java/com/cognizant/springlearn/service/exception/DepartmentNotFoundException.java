package com.cognizant.springlearn.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country not found") 
public class DepartmentNotFoundException extends Exception {
	/**
	 * If no department found for given id this exception is raised
	 */
	private static final long serialVersionUID = 2273176731194282821L;
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentNotFoundException.class);
	public DepartmentNotFoundException(String message) {
		super(message);
		LOGGER.debug("Start");
		LOGGER.debug("End");
	}
	

}
