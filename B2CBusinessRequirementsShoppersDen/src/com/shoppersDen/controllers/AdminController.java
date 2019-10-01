package com.shoppersDen.controllers;
import org.omg.CORBA.UserException;

import com.shoppersDen.models.AdminLoginModel;
import com.shoppersDen.services.AdminServiceImpl;
import com.shoppersDen.views.AdminOptionsView;
import com.shoppersDen.views.ErrorView;

public class AdminController
{
	
	public void Verification(String userName,String password)
	{
		AdminLoginModel adminLoginModel=new AdminLoginModel();    
		adminLoginModel.setAdminName(userName);
		adminLoginModel.setAdminPassword(password);
		AdminServiceImpl userService=new AdminServiceImpl();
		try {
			boolean userVal=userService.adminVerification(adminLoginModel);
			
		if(userVal) {
			AdminOptionsView adminView=new AdminOptionsView();
			adminView.mainAdminOptionsView();
					}
					else
					{
						ErrorView errorView=new ErrorView();
						errorView.authenticationError();
					}
		}catch(Exception e) {
						System.out.println("User Authentication failed");
					}
			}
	
	public void addProductController()
	{
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.addProduct();
	}
	
	public void deleteProductController() {
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.deleteProduct();
	}
	
	
	public void updateProductController() {
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.updateCost();	
	}
	
	
	
	
	
					
}

