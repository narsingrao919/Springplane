package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Planeentity;
import com.example.repository.Planerepo;
import com.example.service.Planeservice;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/api/v1/")
public class Planecontroller {
	
	@Autowired
	Planerepo repo;
	
	@Autowired
	Planeservice service;
	
	@PostMapping("/details")
	@ResponseStatus(HttpStatus.CREATED)
	public Planeentity create(@RequestBody Planeentity entity) {
		return service.insertinto(entity);
	}
	
	@GetMapping("/details/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Planeentity  getting(@PathVariable int id) {
		return service.gettingfromrepo(id);
	}
	
	@PutMapping("/details/{id}")
	public Planeentity update(@PathVariable int id,@RequestBody Planeentity oldentity) {
		return service.updatefromrepo(id,oldentity);
	}
	@DeleteMapping("details/{id}")
	public void delete(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/details") 
	@ResponseStatus(HttpStatus.OK)
	public List<Planeentity> getallitems(){
		return service.getall();
		
	}

}
