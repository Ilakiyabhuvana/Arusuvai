package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;


import com.example.demo.entity.Foodpost;
@Repository
public interface Foodpostrepo  extends JpaRepository<Foodpost, Integer>
{

//	@Query(value = "SELECT * FROM foodpost", nativeQuery = true)
//    List<Foodpost> Findalle();

}


