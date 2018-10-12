package qlam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer Id;
	private String name;
	
	public City() {
		super();
	}
	
	public City(Integer id, String name) {
		super();
		this.Id = id;
		this.name = name;
	}
	
	public void setId(Integer id) {
		this.Id = id;
	}
	
	public Integer getId() {
		return this.Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}



