package com.pack.SpringInterceptors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value = "/emp")
	public String getEmployee() {
		return "This is the employee class";
	}
}
