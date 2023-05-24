package com.bala.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.bala.CustomerDataManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
  //java persistence apa
	
	List<Customer> findByName(String name);
	
	@Query("SELECT c FROM Customer c WHERE c.name=:name AND c.email=:email")
	List<Customer> validateCustomer(@PathVariable("name") String name, @PathVariable("email") String email);
}
