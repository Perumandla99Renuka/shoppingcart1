package com.niit.shoppingcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {

	@Id
	private String prot_id;
	private String prot_name;
	private String prot_description;
	private String prot_price;
	private String category_id;
		private String supplier_id;
		
		public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
		

	public String getSupplier_id() {
			return supplier_id;
		}
		public void setSupplier_id(String supplier_id) {
			this.supplier_id = supplier_id;
		}
	
	@ManyToOne
	@JoinColumn(name="category_id" ,updatable=false,insertable=false,nullable=false)
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="supplier_id", updatable=false,insertable=false,nullable=false)
	private Supplier supplier;
	
		 public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getProt_id() {
		return prot_id;
	}
	public void setProt_id(String prot_id) {
		this.prot_id = prot_id;
	}
	public String getProt_name() {
		return prot_name;
	}
	public void setProt_name(String prot_name) {
		this.prot_name = prot_name;
	}
	public String getProt_description() {
		return prot_description;
	}
	public void setProt_description(String prot_description) {
		this.prot_description = prot_description;
	}
	public String getProt_price() {
		return prot_price;
	}
	public void setProt_price(String prot_price) {
		this.prot_price = prot_price;
	}
	
}
