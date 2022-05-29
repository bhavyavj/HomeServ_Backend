package com.example.urban.FinalProject.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.example.urban.FinalProject.bean.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long >{


	public boolean existsByEmail(String email);
	public Users findByEmailAndPassword(String email, String password);
	@Query("Select email,password from Users")
	List<String> findEmailandPassword();

}
