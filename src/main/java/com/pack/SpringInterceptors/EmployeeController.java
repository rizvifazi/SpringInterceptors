package com.pack.SpringInterceptors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class EmployeeController {

	@GetMapping(value = "/emp")
	public String getEmployee() {
		log.info("This is inside the getemployee controller method");
		return "This is the employee class";
	}
}
