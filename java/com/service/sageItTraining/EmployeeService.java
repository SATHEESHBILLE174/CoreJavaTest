package com.service.sageItTraining;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.sageItTraining.EmployeeRepository;
import com.pojos.sageItTraining.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;

	}

	public Employee getEmployee(String empid) {

		return employeeRepository.findById(empid).get();
	}

	public void addEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	public void updateEmployee(String id, Employee emp) {

		employeeRepository.save(emp);

	}

	public void deleteEmployee(String id) {

		employeeRepository.deleteById(id);
	}
}
