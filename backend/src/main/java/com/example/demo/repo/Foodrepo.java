package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Foodentity;

@Repository
public interface Foodrepo extends JpaRepository<Foodentity, Integer>
{
	
}
