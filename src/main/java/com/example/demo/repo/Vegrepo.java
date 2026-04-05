package com.example.demo.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Fooddetails;


@Repository
public interface Vegrepo extends JpaRepository<Fooddetails, Integer> {
	public List<Fooddetails> findByCategory(String category);

	public List<Fooddetails> findByResname(String resname);

	public List<Fooddetails> findByFoodname(String foodname);
//	public Optional<Fooddetails> findById(int id);
//	public Fooddetails viewById(int id);
	
}
