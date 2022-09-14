package com.Neosoft.CrudApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Neosoft.CrudApplication.Entity.Department;
import com.Neosoft.CrudApplication.Entity.Employee;
import com.Neosoft.CrudApplication.Repository.DepartmentrRepository;
import com.Neosoft.CrudApplication.Repository.EmployeeRepository;
@Service
public class EmployeeService {
	
	 @Autowired
	    private EmployeeRepository employeeRepository;
	    @Autowired
	    private DepartmentrRepository departmentRepository;
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    public Employee addEmployee(Employee employee) {
	        Department dept = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
	        if (null == dept) {
	            dept = new Department();
	        }
	        dept.setDeptName(employee.getDepartment().getDeptName());
	        employee.setDepartment(dept);
	        return employeeRepository.save(employee);
	    }
	    public Employee editEmployees(Employee entity) {
	        return employeeRepository.save(entity);
	    }
	    public void deleteEmployees(Integer id) {
	        employeeRepository.deleteById(id);
	    }

}
