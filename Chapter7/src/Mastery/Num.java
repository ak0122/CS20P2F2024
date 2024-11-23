package Mastery;

public class Num {
	
	private int n;
	
	//Constructor to initialize my number
	
	public Num(int number)
	{
		n = number;
	}
	
	public int getNum()
	{
		return n;
	}
	
	public int getOnes()
	{
		int o;
		o = n % 10;
		return o;
	}
	
	public int getTens()
	{
		int t;
		t = (n/10) % 10;
		return t;
	}
	
	public int getHundreds()
	{
		int h;
		h = n/100;
		return h;	
	}
}
