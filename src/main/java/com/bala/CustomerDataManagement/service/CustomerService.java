package com.bala.CustomerDataManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.CustomerDataManagement.entity.Customer;
import com.bala.CustomerDataManagement.repository.CustomerDao;
import com.bala.CustomerDataManagement.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
	
	public  List<Customer> getAllCustomerData(){
		return dao.getAllCustomerData();
	}
		
		public Customer getCustomerDataById(int id) {
			return dao.getCustomerDataById(id);
		}
		
		public Customer deleteCustomerDataById(int id) {
			return dao.deleteCustomerDataById(id);
		}
		public List<Customer> getCustomerByName(String name){
			return dao.getCustomerByName(name);
		}
		
		public List<Customer> validateCustomer(String name, String email){
			return dao.validateCustomer(name, email);
		}
}
