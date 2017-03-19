package com.conley.jsf.musicshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("com.conley.jsf.PhoneNumber")
public class PhoneNumberValidator {
	
	private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("[0-9-{3}-[0-9]-{3}-[0-9]-{4}")

}
