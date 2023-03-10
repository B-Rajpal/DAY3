package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService aservice;
	
	@PostMapping("/add")
	public String AddDetails(@RequestBody Employee e) {
	aservice.addDetail(e);
	return "data added";
	}
	@GetMapping("/")
	public List<Employee> getdetails(){
		return aservice.getDetails();
	}
	@GetMapping("/{id}")
	public Optional<Employee> getById(@PathVariable int id){
		return aservice.getById(id);
	}

}
