package com.example.demo.repo;

import java.util.List;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Userlogin;

import jakarta.persistence.Entity;




@Repository
public interface Userloginrepo extends JpaRepository<Userlogin, Integer>  {
//	@Query("SELECT u FROM Userlogin u WHERE u.username =?1 AND u.password =?2")
//	
//	@Entity
//	@NamedQuery(name = "Userlogin.findByUsernameAndPassword", 
//	            query = "SELECT u FROM Userlogin u WHERE u.username = :username AND u.password = :password")
//	
//	@Query(value = "SELECT * FROM userlogin u WHERE u.username = ?1 AND u.password = ?2", nativeQuery = true)
public List<Userlogin> findByUsernameAndPassword(String username, String password);
	//public Userlogin findByLogin(String username, String password); nativequery //named query
////	Userlogin findByUsername(String username);
//	Userlogin findByEmailIgnoreCase(String email);

//    Boolean existsByEmail(String email);
}
