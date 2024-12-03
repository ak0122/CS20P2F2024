package Skillbuilders;

public class Reverse {

	public static void main(String[] args) {
		
		int[] reverse = {0,1,2,3,4,5,6,7,8,9};

		System.out.println("COUNTDOWN");
		for(int i=0; i < reverse.length; i++)
		{
			System.out.println(reverse[9-i]);
		}
	}

}
