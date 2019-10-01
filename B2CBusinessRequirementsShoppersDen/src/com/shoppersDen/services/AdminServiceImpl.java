package com.shoppersDen.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shoppersDen.entities.Product;
import com.shoppersDen.models.AdminLoginModel;
import com.shoppersDen.models.ProductModel;
import com.shoppersDen.repository.AdminRepository;
import com.shoppersDen.views.AdminOptionsView;

public class AdminServiceImpl implements AdminService {
	
		AdminRepository admin1=new AdminRepository();
		
		public boolean adminVerification(AdminLoginModel adminLoginModel) {
			
		// TODO Auto-generated method stub
		if(adminLoginModel.getAdminName().equals("Sahithi")&&adminLoginModel.getAdminPassword().equals("reddy"))
		{	
			return true;
		}
			return false;
	}

		@Override
		public void addProduct()
		{
			List<ProductModel> product = new ArrayList<ProductModel>();
			AdminOptionsView adminOptionsView = new AdminOptionsView();
			ProductModel productModel =new ProductModel();
			productModel = adminOptionsView.retriveProduct();
			product.add(productModel);		
		}

		@Override
		public void deleteProduct()
		{  
			Scanner scanner = new Scanner(System.in) ;
			
			List<ProductModel> product = new ArrayList<ProductModel>();
			AdminOptionsView adminOptionsView = new AdminOptionsView();
			ProductModel productModel =new ProductModel();
			productModel = adminOptionsView.retriveProduct();
			System.out.println("enter product id to delete product");
			int productId = scanner.nextInt();
			product.remove(productId);	
		}

		@Override
		public void updateCost()
		{
			Scanner scanner = new Scanner(System.in);
			
			List<ProductModel> product = new ArrayList<ProductModel>();
			AdminOptionsView adminOptionsView = new AdminOptionsView();
			ProductModel productModel =new ProductModel();
			productModel = adminOptionsView.retriveProduct();
			System.out.println("enter product id to update product cost");
			int productId = scanner.nextInt();
			System.out.println("enter new cost to the product");
			int price= scanner.nextInt();
			if(productModel.getProductId()==productId)
			productModel.setPrice(price);
				
			
		}

		@Override
		public void viewTransaction()
		{
			
			
			
		}

		
}


