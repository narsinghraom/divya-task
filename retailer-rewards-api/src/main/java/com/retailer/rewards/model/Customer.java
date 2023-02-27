/**
 * 
 */
package com.retailer.rewards.model;

import java.util.Set;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Narsingh Mahankali
 *
 */
@Entity
@Setter
@Getter
public class Customer {
	

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MyTransaction> transactions;
	@JsonInclude
	@Transient
	private Long rewardPoints;
	@JsonInclude
	@Transient
	private Double totalPurchases;


}
