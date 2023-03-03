package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo erepo;
	
	public List<Employee> getDetails(){
		return erepo.findAll();
	}
	public Optional<Employee> getById(int id){
		return erepo.findById(id);
	}
	
	public void addDetail(Employee e) {
		erepo.save(e);
	}

}
