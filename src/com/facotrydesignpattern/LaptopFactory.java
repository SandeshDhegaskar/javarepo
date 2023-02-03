package com.facotrydesignpattern;

public class LaptopFactory {
	 public Laptop Laptop(String str) {
	
		if(str.equals("secured"))
		{
		 return new Macbook();
		}else if(str.equals("MostUseSecured")) {
			return new DellLaptop();
		}else {
			return new HpLaptop();
		}
		
		
		
	}
	

}
