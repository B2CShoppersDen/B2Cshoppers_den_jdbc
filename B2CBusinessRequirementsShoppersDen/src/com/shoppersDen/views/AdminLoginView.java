package com.shoppersDen.views;

import java.util.Scanner;

import com.shoppersDen.controllers.AdminController;

public class AdminLoginView {

	public void mainAdminView() {
		
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("======Admin View======");
		
		System.out.println("Enter UserName");
		String adminName=scanner.next();
		System.out.println("Enter Password");
		String adminPassword=scanner.next();
		
		AdminController adminController=new AdminController();
		adminController.Verification(adminName,adminPassword);
	}

}
