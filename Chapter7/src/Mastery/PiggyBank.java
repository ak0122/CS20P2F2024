package Mastery;

import java.text.NumberFormat;

public class PiggyBank {

	//Define the values of each coin type in dollars
	private static double  P = 0.01, N = 0.05, D = 0.1, Q = 0.25;
	
	//Define a total balance value
	private double B;
	
	//decimal format to keep balances to proper number of digits of money
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	// Constructor method to initialize balance value
	public PiggyBank()
	{
		B = 0;
	}
	
	//overloading the Constructor method
	public PiggyBank(double initalB)
	{
		B = initalB;
	}
	
	//Method to get balance
	public double getB()
	{
		return B;
	}
	
	//Method to convert Balance to string
	public String toString()
	{
		String B_string;
		
		B_string = "Your total Bank Balance is "+ nf.format(B);
		
		return(B_string);
	}
	//Method to add Pennies
	public String AddP()
	{
		String P_added;
		
		B += P;
		
		P_added = "$ 0.01 was added to your balance";
		
		return(P_added);
		
	}
	
	//Similar Methods for adding other coin types
	
	public String AddN()
	{
		String N_added;
		
		B += N;
		
		N_added = "$ 0.05 was added to your balance";
		
		return(N_added);
		
	}
	
	public String AddD()
	{
		String D_added;
		
		B += D;
		
		D_added = "$ 0.10 was added to your balance";
		
		return(D_added);
		
	}
	
	public String AddQ()
	{
		String Q_added;
		
		B += Q;
		
		Q_added = "$ 0.25 was added to your balance";
		
		return(Q_added);
		
	}

	//Method to take out money
	
	public String takeM(double out)
	{
		double M_out;
		String money_out;
		
		M_out = out;
		
		if(M_out > B)
		{
			money_out = "Your Bank balance is insufficient to take out your desired amount. Please add funds to your account.";
		}
		else
		{
		B -= M_out;
		
		money_out = "You have successfully taken out " + nf.format(M_out) + " from your bank account.";
		}
		
		return(money_out);
		
	}
	
	
	
}
