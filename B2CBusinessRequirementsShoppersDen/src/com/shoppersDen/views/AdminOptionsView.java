 package com.shoppersDen.views;

import java.util.Scanner;

import com.shoppersDen.controllers.AdminController;
import com.shoppersDen.models.ProductModel;

public class AdminOptionsView {

	public void mainAdminOptionsView()
	{
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("main menu");
		System.out.println("1 addProduct");
		System.out.println("2 deleteProduct");
		System.out.println("3 updateCost");
		System.out.println("4 viewTransaction");
		System.out.println("enter your choice");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1: addProduct();
		break;
		
		case 2:deleteProduct();
		break;
			
		
		
		
		}
		
		
		
		
		
		}
		public ProductModel retriveProduct()
		{
			ProductModel productModel = new ProductModel();
			productModel.getImg_url();
			productModel.getCategoryId();
			productModel.getPrice();
			productModel.getProductDescription();
			productModel.getProductId();
			productModel.getProductName();
			productModel.getQuantity();
			
			return productModel;
			
			
		
		}
		public void addProduct()
		{
			AdminController adminController = new AdminController();
			adminController.addProductController();
		
		}
		
		public void deleteProduct()
		{
			AdminController adminController=new AdminController();
			adminController.deleteProductController();
		}
		public void updateProduct()
		{
			AdminController adminController=new AdminController();
			adminController.updateProductController();
		}
		
	
	
	
}
   