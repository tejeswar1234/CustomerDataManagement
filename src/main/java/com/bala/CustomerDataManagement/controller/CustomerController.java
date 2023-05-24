package com.bala.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.CustomerDataManagement.entity.Customer;
import com.bala.CustomerDataManagement.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@PutMapping("/save")
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@GetMapping("/save")
	public @ResponseBody List<Customer> getAllCustomerData(){
		return service.getAllCustomerData();
	}
	
	@GetMapping("/save/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id) {
		return service.getCustomerDataById(id);
	}
	
	@DeleteMapping("/save")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id") int id) {
		return service.deleteCustomerDataById(id);	
    }
	
	@GetMapping("/saved/{name}")
	public List<Customer> getCustomerByName(@PathVariable("name") String name){
		return service.getCustomerByName(name);
	}
	
	@PostMapping("/validation")
	public List<Customer> validateCustomer(@RequestParam("name") String name,@RequestParam("email") String email){
		return service.validateCustomer(name, email);
	}
}
