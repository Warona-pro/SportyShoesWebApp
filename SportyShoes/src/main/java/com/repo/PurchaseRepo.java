package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Purchase;



public interface PurchaseRepo extends JpaRepository<Purchase, Long> {
	
	  Purchase findById(long id);

	  @Query("select p from Purchase p where p.userId = ?1 order by ID desc")
	  List<Purchase> getAllItemsByUserId(long userId);
}