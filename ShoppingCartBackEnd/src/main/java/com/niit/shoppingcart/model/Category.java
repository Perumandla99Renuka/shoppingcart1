package com.niit.shoppingcart.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {

	@Id
	private String ctg_id;
	@NotEmpty
	private String ctg_name;
	@NotEmpty
	private String ctg_description;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="category")
	private Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}

	public void SetProducts(Set<Product> products) {
		this.products = products;
	}

	public String getCtg_id() {
		return ctg_id;
	}

	public void setCtg_id(String ctg_id) {
		this.ctg_id = ctg_id;
	}

	public String getCtg_name() {
		return ctg_name;
	}

	public void setCtg_name(String ctg_name) {
		this.ctg_name = ctg_name;
	}

	public String getCtg_description() {
		return ctg_description;
	}

	public void setCtg_description(String ctg_description) {
		this.ctg_description = ctg_description;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	
}




