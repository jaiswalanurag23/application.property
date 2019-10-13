package com.service_i;

import com.model.Employee;

public interface Service_i 
{
	public Employee saveData(Employee emp);
	public Employee getEmp(int id);
	public void delEmp(int id);
	
	

}
