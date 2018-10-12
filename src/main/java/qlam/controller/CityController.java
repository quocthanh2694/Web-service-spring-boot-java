package qlam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import qlam.model.City;
import qlam.service.CityService;

@RestController
@RequestMapping("city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping("/getall")
	public List<City> getAll() {
		return (List<City>) cityService.findAll();
	}
	
	@RequestMapping("/{id}")
	public City getById(@PathVariable("id") int id) {
		City c = cityService.findOne(id);
		if(c== null) {
			System.out.println("Id: " + id + " not found");
		}
		return c;
	}
	
	@PostMapping("/add")
	public City add(@RequestBody City c) {
		cityService.save(c);
		return c;
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		City temp = cityService.findOne(id);
		if(temp == null) {
			System.out.println("Id not exist!");
			return;
		}
		cityService.delete(id);
	}
	
	@PutMapping("/update")
	public City update (@RequestBody City c) {
		City temp = cityService.findOne(c.getId());
		if(temp != null) {
			cityService.save(c);
			return c;
		}
		return temp;
	}
	
	
}
