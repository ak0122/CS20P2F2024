	package Mastery;

public class Food {

		private String name;
		private double price;
		private int fat , carbs , fiber ;
		
		
		
		public Food(String n,double p, int f, int c, int fib)
		{
			name = n;
			price = p;
			fat = f;
			carbs = c;
			fiber = fib;
		}
		
		public double getPrice()
		{
			
	        return price;
	    }
	    
	    public String toString()
	    {
	    	String info;
	    	info = "Each "+ name + " has " + fat +"g of fat, " + carbs+ "g of carbs, and "+ fiber + "g of fiber";
	    	return info;
	    }
	}


