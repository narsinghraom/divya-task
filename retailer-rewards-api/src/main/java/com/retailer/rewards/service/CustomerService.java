/**
 * 
 */
package com.retailer.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailer.rewards.model.Customer;
import com.retailer.rewards.repository.CustomerRepository;

/**
 * @author Narsingh Mahankali
 *
 */

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getCustomerAll() {
		return customerRepository.findAll();
	}
	

}
