package com.shoppersDen.services;

import com.shoppersDen.models.AdminLoginModel;

public interface AdminService {
	
	public boolean adminVerification(AdminLoginModel adminLoginModel);
	public void addProduct();
	public void deleteProduct(); 
	public void updateCost();
	public void viewTransaction();

	
}
