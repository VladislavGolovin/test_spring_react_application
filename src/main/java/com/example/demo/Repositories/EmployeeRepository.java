package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}
