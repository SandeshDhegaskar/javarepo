package com.facotrydesignpattern;

public class FactoryMain {
	public static void main(String[] args) {
		
	
  LaptopFactory alLaptop=new LaptopFactory();
  Laptop lp= alLaptop.Laptop("secured");
  lp.Laptopspec();
  
 
}
}