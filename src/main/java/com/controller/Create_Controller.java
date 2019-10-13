package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.Employee;
import com.service_i.Service_i;

@RestController
public class Create_Controller
{
	@Autowired
	Service_i service;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Employee> createEmp(@RequestBody Employee emp)
	{
		System.out.println("In MS-Create Employee...");
		
		service.saveData(emp);
		
		String url="http://localhost:8011/delete";
				
		return restTemplate.postForEntity(url, emp, Employee.class);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delEmp(@PathVariable("id") int id)
	{
		System.out.println("In MS-Delete Employee...");
				
		service.delEmp(id);
	}
	
	@GetMapping(value = "/getRecord/{id}")
	public Employee getEmp(@PathVariable("id") int id)
	{
		Employee emp = service.getEmp(id);
		System.out.println(id);
		/*
		 * if (emp.id==000) { return throw RuntimeException(); } else { return emp;
		 * 
		 * }
		 */
		
		return emp;
		
		
		
		
	}
	
	
	

}
