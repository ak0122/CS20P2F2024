package Skillbuilders.CirclePt1;

import java.text.DecimalFormat;

public class CircleTestPt1 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		
		Circle spot = new Circle();
		
		spot.setRadius(5);
		
		System.out.println("The radius is "+spot.getRadius());
		System.out.println("The area is " +df.format(spot.circumference()));
		

		
		
	}

}
