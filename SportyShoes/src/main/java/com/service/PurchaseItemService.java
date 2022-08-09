package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.*;
import com.repo.PurchaseItemRepo;

@Transactional
@Service
public class PurchaseItemService {

	 @Autowired
	 private PurchaseItemRepo repo;

		public PurchaseItem getItemById(long id) {
			return repo.findById(id);
		}
		
		public List<PurchaseItem> getAllItemsByPurchaseId(long purchaseId) {
			return repo.getAllItemsByPurchaseId(purchaseId);
		}	
		
		public void updateItem(PurchaseItem item) {
		 	repo.save(item);
		}
		
		public void deleteItem(long id) {
		 	repo.deleteById(id);
		}

		public void deleteAllItemsForPurchaseId(long purchaseId) {
		 	repo.deleteAllItemsByPurchaseId(purchaseId);
		}


}