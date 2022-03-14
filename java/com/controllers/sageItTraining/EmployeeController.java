package com.controllers.sageItTraining;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.sageItTraining.EmployeeRepository;
import com.pojos.sageItTraining.Employee;
import com.service.sageItTraining.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllTheEmployees() {
		return employeeService.getAllEmployees();
	}
	@RequestMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable String empId) {
		return employeeService.getEmployee(empId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);  
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{empId}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable String empId) {
		employeeService.updateEmployee(empId,emp);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{empId}")
	public void deleteEmployee(@PathVariable String empId) {
		employeeService.deleteEmployee(empId);
	}


}
