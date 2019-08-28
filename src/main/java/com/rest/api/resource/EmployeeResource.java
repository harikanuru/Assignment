package com.rest.api.resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeResource {

	 private static final Logger LOGGER = (Logger) LogManager.getLogger(EmployeeResource.class);
	 
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public @ResponseBody String getWelcome() {
		
		LOGGER.info( "/welcome - &gt; ");
		LOGGER.debug( "/welcome - &gt; ");
		return "welcome";
	}
}
