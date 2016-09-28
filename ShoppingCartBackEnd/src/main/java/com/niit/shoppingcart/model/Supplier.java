package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	
	@Id
	private String supr_id;
	private String supr_name;
	private String supr_address;
	
	@OneToMany(mappedBy = "supplier", fetch=FetchType.EAGER)
	private Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}
	
	public String getSupr_id() {
		return supr_id;
	}

	public void setSupr_id(String supr_id) {
		this.supr_id = supr_id;
	}

	public String getSupr_name() {
		return supr_name;
	}

	public void setSupr_name(String supr_name) {
		this.supr_name = supr_name;
	}

	public String getSupr_address() {
		return supr_address;
	}

	public void setSupr_address(String supr_address) {
		this.supr_address = supr_address;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}