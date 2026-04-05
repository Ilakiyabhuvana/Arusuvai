package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Payment;

public interface Payrepo extends JpaRepository<Payment, Integer> {
	public List<Payment> findByName(String name);
	public Optional<Payment> findById(Integer id);
}
