package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Planeentity;

@Repository
public interface Planerepo extends JpaRepository<Planeentity, Integer> {
	

}