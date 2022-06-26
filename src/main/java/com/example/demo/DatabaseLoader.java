package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.Employee;
import com.example.demo.Repositories.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee(1L ,"Frodo", "Baggins", "ring bearer"));
	}
}