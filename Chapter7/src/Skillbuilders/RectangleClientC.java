package Skillbuilders;

import java.text.DecimalFormat;

public class RectangleClientC {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		
		Rectangle rect = new Rectangle(5,4);
		
		System.out.println("The perimeter is "+ df.format(rect.rectPerimeter()));
		Rectangle.displayRectArea();
		System.out.println("The area is " + df.format(rect.rectArea()));
		
}}
