package com.flight.app;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Jyotiranjan Jena
 *
 */
@SpringBootApplication(scanBasePackages={"com.flight"})
public class SpringBootFlightSearchApp {
	private static final Logger logger = Logger.getLogger("SearchFlight");
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootFlightSearchApp.class, args);
		logger.info("Inside main method");
		SpringApplication.run(SpringBootFlightSearchApp.class, args);
	}

}
