package com.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("category")
	private List<Product> products ;
	
	

	public Category() 
	{
		super();
	}

	public Category(String name)
	{
		super();
		this.name = name;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(List<Product> products) 
	{
		this.products = products;
	}

	@Override
	public String toString() 
	{
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}



	

}
