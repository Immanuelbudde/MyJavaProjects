package com.version1;
public class Test {
	public static void main(String[] args) {
		Customer deepika = new Customer();
		Zomato zomato = new Zomato();
		deepika.getFood(zomato);
		
		Customer junnu = new Customer();
		Swiggy swiggy = new Swiggy();
		junnu.getFood(swiggy);
		
		Customer arun = new Customer();
		Kfc kfc = new Kfc();
		arun.getFood(kfc);

	}

}
