package com.dao_i;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;


@Repository
public interface Dao_i extends JpaRepository<Employee, Integer>
{
	
}
