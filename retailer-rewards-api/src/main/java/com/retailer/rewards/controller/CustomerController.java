/**
 * This class is to get the customer reward points
 * 
 */
package com.retailer.rewards.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.rewards.model.Customer;

/**
 * @author Narsingh Mahankali
 *
 */

@RestController
public class CustomerController {

	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = null;//rewardsService.getCustomerById(id);
		if (customer == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

}
