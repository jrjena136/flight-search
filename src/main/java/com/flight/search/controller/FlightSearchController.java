package com.flight.search.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.search.service.FlightSearchService;


/**
 * @author Jyotiranjan Jena
 *
 */
@RestController
@RequestMapping("/searchFlights")
public class FlightSearchController {
	private static final Logger logger = Logger.getLogger("SearchFlight");
	@Autowired
	FlightSearchService iFlightSearchService; 

//	@RequestMapping(value="/searchFlights/{Origin}/{Destination}",method=RequestMethod.GET)
	@GetMapping("/{Origin}/{Destination}")
	public String searchFlights(@PathVariable("Origin") String origin, @PathVariable("Destination") String destination){
		logger.info("origin : " + origin + ", Destination : " + destination);
		return iFlightSearchService.searchFlights(origin, destination);
	}
}
