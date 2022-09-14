package com.Neosoft.CrudApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.Neosoft.CrudApplication.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Neosoft.CrudApplication.Entity.Employee;
import java.util.List;

@RestController
public class EmlpoyeeController {
	
	private static final String HttpStatus = null;
	@Autowired
    private EmployeeService employeeService;
    @GetMapping("/get-employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.addEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.editEmployees(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @DeleteMapping("/employee")
    public ResponseEntity<String> deleteEmployee(@RequestParam(name = "employeeId") Integer employeeId) {
        employeeService.deleteEmployees(employeeId);
        return new ResponseEntity<>("Employee with ID :" + employeeId + " deleted successfully", HttpStatus.OK);
    }

}
