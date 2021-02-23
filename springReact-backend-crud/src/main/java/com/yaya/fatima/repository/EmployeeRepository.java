package com.yaya.fatima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yaya.fatima.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
