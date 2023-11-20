package com.ram.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value= {"dev","prod","local"})
public class EmployeeController {

	@Value("${data.msg}")
	private String msg;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/data")
	public List<Employee> getData() {
		
		return employeeRepository.findAll();
	}

}
