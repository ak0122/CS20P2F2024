	package Mastery;

import java.text.DecimalFormat;

public class Food {

		private String name;
		private double price;
		private int fat , carbs , fiber ;
		
		
		DecimalFormat df = new DecimalFormat("0.0");
	
		public Food(String n,double p, int f, int c, int fib)
		{
			name = n;
			price = p;
			fat = f;
			carbs = c;
			fiber = fib;
		}
		
		public String getName()
		{
			
	        return name;
	    }
		
		public double getPrice()
		{
			
	        return price;
	    }

	    public int getFat()
	    {
	        return fat;
	    }

	    public int getCarbs()
	    {
	        return carbs;
	    }

	    public int getFiber() 
	    {
	        return fiber;
	    }
	    
	    public String toString()
	    {
	    	String info;
	    	info = "Each "+ name + " has " + df.format(fat) +"g of fat, " + df.format(carbs)+ "g of carbs, and "+ df.format(fiber) + "g of fiber";
	    	return info;
	    }
	}


