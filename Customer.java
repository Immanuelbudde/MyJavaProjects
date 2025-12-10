package com.version1;
public class Customer {
	public void getFood(Zomato obj) {
		obj.zomatoOrder();
	}
	
	public void getFood(Kfc obj) {
		obj.kfcOrder();
	}
	
	public void getFood(Swiggy obj) {
		obj.swiggyOrder();
	}
}
