package com.dao.sageItTraining;

import org.springframework.data.repository.CrudRepository;

import com.pojos.sageItTraining.Employee;

public interface  EmployeeRepository extends CrudRepository<Employee, String> {

}
