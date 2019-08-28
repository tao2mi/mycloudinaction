package com.ybq.application.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() throws Exception {
		String host = discoveryClient.getLocalServiceInstance().getHost();
		String serviceId = discoveryClient.getLocalServiceInstance().getServiceId();
		logger.info("host: " + host +", serviceId: " + serviceId);

		return "Hello World" + logger.getLevel();
	}


}