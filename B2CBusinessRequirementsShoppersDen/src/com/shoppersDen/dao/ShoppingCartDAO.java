package com.shoppersDen.dao;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.Customer_DAO;

public interface ShoppingCartDAO {
	
	private int orderNumber;
	private CustomerDao customerdao;
	   private final List<ShoppingCartDao> cart = new ArrayList<ShoppingCartDao>();
	
	public void CartInfo() {
		
	}
	
	public int getorderNumber() {
		return orderNumber;
		}
	public void setOrderNumber(int orderNumber) {
		
		this.orderNumber=orderNumber;
	}
	
	   public List<Customer_DAO> getCart() {
	        return this.customerdao;
	        
	    }
	   
	   private CartIfo findLineByCode(String code) {
	        for (CartInfo  : this.cart) {
	            if (cart.getProductInfo().getCode().equals(code)) {
	                return cart;
	            }
	        }
	        return null;
	    }
	
	
	
	
	
	
	
	
	

}
