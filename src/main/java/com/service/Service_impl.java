package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao_i.Dao_i;
import com.model.Employee;
import com.service_i.Service_i;

@Service
public class Service_impl implements Service_i 
{
	@Autowired
	Dao_i dao;

	@Override
	public Employee saveData(Employee emp) 
	{
		System.out.println("In Save data Service impl, MS- Create...");
		return dao.save(emp);
	}

	@Override
	public void delEmp(int id) {
		System.out.println("In Delete data Service impl, MS- Create...");	
		dao.deleteById(id);
	}

	@Override
	public Employee getEmp(int id) 
	{
		
		return dao.findById(id).get();
	}
	

}
