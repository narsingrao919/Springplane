package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Planeentity;
import com.example.exception.Planeexception;
import com.example.repository.Planerepo;

@Service
public class Planeservice {
	
	
	@Autowired
	Planerepo repo;

	public Planeentity insertinto(Planeentity entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	public Planeentity gettingfromrepo(int id) {
		// TODO Auto-generated method stub
		Planeentity entity =repo.findById(id).orElseThrow(()->new Planeexception("id not found"+id));
		return entity;
	}

	public Planeentity updatefromrepo(int id, Planeentity oldentity) {
		// TODO Auto-generated method stub
		Planeentity newentity=repo.findById(id).orElse(new Planeentity() );
		newentity.setModel(oldentity.getModel());
		newentity.setPlanename(oldentity.getPlanename());
		newentity.setAirport(oldentity.getAirport());
		newentity.setBrand(oldentity.getBrand());
		newentity.setKilometers(oldentity.getKilometers());
		repo.save(newentity);
		return newentity;
	}

	public List<Planeentity> getall() {
		// TODO Auto-generated method stub
		List<Planeentity>list=repo.findAll();
		return list;
	}

	
	
	

	

}
