package Mastery;

import java.text.DecimalFormat;
import java.util.Random;

public class test {

	public static void main(String[] args)
	{
		String ans;
		int n_1,n_2;
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		
		n_1 = random.nextInt(10)+1;
		n_2 = random.nextInt(10)+1;
		System.out.print("\n"+n_1);
		System.out.print("\n"+n_2);
		System.out.print("\n"+df.format((double)n_1/(double)n_2));
	}
}
