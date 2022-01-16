package com.org.restservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	//GetMethod
	@RequestMapping("/empinfo")
	public Employee Emp(@RequestParam(value="empid")int empid) {
		Employee e1 = new Employee();
		 e1.setEmpName(" Wajhul");
		 e1.setEmpid(empid);
		 e1.setAddress("Mumbai");
		 return e1;
	}
	
	

}
