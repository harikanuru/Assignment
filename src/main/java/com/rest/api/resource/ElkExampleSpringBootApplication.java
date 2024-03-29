package com.rest.api.resource;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ElkExampleSpringBootApplication {
	private static final Log LOG = LogFactory.getLog(ElkExampleSpringBootApplication.class);

	@Autowired
	RestTemplate restTemplete;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping(value = "/elkdemo")
	public String helloWorld() {
		String response = "Hello user ! " + new Date();
		LOG.info(Level.INFO+ "/elkdemo - &gt; " + response);

		return response;
	}

	@RequestMapping(value = "/elk")
	public String helloWorld1() {

		String response = (String) restTemplete
				.exchange("http://localhost:8080/elkdemo", HttpMethod.GET, null, new ParameterizedTypeReference() {
				}).getBody();
		LOG.info(Level.INFO + "/elk - &gt; " + response);

		try {
			String exceptionrsp = (String) restTemplete.exchange("http://localhost:8080/exception", HttpMethod.GET, null,
					new ParameterizedTypeReference() {
					}).getBody();
			LOG.info(Level.INFO+ "/elk trying to print exception - &gt; " + exceptionrsp);
			response = response + " === " + exceptionrsp;
		} catch (Exception e) {
			// exception should not reach here. Really bad practice 🙂
		}

		return response;
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		String rsp = "";
		try {
			int i = 1 / 0;
			// should get exception
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString(); // stack trace as a string
			LOG.error("Exception As String :: - &gt; " + sStackTrace);

			rsp = sStackTrace;
		}

		return rsp;
	}

}
