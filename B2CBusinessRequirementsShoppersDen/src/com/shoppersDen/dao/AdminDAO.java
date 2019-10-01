package com.shoppersDen.dao;

import com.shoppersDen.models.AdminLoginModel;

public interface AdminDAO
{
	public boolean adminVerification(AdminLoginModel adminLoginModel);
	public void addProduct();
	public void deleteProduct(); 
	public void updateCost();
	public void viewTransaction();
	

}
