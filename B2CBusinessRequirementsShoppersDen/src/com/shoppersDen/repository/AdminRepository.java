package com.shoppersDen.repository;

import java.util.ArrayList;
import java.util.List;

import com.shoppersDen.entities.Admin;

public class AdminRepository {
	
	private static List<Admin> adminRepository=
			new ArrayList<Admin>();
	static 
	{
		Admin admin=new Admin();
		admin.setAdminId(10001);
		admin.setAdminUserName("sahithi");
		admin.setAdminPassword("reddy");
	}
	
	
	
}
