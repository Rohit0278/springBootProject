package com.Neosoft.CrudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Neosoft.CrudApplication.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
