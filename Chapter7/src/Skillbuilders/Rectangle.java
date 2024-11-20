package Skillbuilders;

public class Rectangle {

	private double height;
	private double width;
	
	public Rectangle(double h, double w) {
		height = h ;
		width = w ;
	}
	
	public double rectArea() {
		double area = height * width ;
		return area;
	}
	
	public double rectPerimeter() {
		double perimeter = 2*height +2*width ;
		return perimeter;
	}
	
	public static void displayRectArea() {
		System.out.println("The formula for the area of a circle is area = length*width");
	}
}
