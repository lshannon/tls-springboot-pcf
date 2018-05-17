package com.lukeshannon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	
	@GetMapping("/home")
	public String home() {
		log.info("In the home controller");
		return "Welcome home!";
	}

}
