package Skillbuilders;

import java.text.DecimalFormat;

public class CircleTestPt1 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		
		Circle1 spot = new Circle1(5);
		
		System.out.println("The radius is "+spot.getRadius());
		Circle1.displayAreaFormula();

		System.out.println("The area is " +df.format(spot.circumference()));
		
		
		
	}

}
