package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	

	  User findByemailId(String emailId);
	  
	  @Query("select u from User u where u.emailId = ?1 and u.pwd = ?2")
	  User authenticate(String emailId, String pwd);

	  User findById(long id);
}