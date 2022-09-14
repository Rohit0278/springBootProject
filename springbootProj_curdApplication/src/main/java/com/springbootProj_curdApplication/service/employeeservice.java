package com.springbootProj_curdApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootProj_curdApplication.entity.employee;
import com.springbootProj_curdApplication.entity.Department;

import com.springbootProj_curdApplication.repository.employeerepo;
import com.springbootProj_curdApplication.repository.Departmentrepo;
@Service
public class employeeservice {
	
	 @Autowired
	    private employeerepo employeeRepository;
	    @Autowired
	    private Departmentrepo departmentRepository;
	    public List<employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    public employee addEmployee(employee employee) {
	        Department dept = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
	        if (null == dept) {
	            dept = new Department();
	        }
	        dept.setDeptName(employee.getDepartment().getDeptName());
	        employee.setDepartment(dept);
	        return employeeRepository.save(employee);
	    }
	    public employee editEmployees(employee entity) {
	        return employeeRepository.save(entity);
	    }
	    public void deleteEmployees(Integer id) {
	        employeeRepository.deleteById(id);
	    }

}
