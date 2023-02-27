/**
 * 
 */
package com.retailer.rewards.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Narsingh Mahankali
 *
 */
@Getter
@Setter
public class MyTransaction extends Rewards{
	
	@Id
	@GeneratedValue
	private Long id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn //foreign key to customer
	private Customer customer;
	private Double total;
	private String description;
	//@Temporal(TemporalType.DATE)
	@Temporal(TemporalType.TIMESTAMP)
	private Date saveDate;
	

}
