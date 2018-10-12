package qlam.repository;

import org.springframework.data.repository.CrudRepository;

import qlam.model.City;

public interface CityRepository extends CrudRepository<City, Integer> {
	
}
