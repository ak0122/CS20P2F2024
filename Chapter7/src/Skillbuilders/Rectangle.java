package Skillbuilders;

public class Rectangle {

	private double height,width;
	
	
	public Rectangle()
	{
		height = 1;
		width = 1;
	}
	
	public Rectangle(double h, double w)
	{
		height = h ;
		width = w ;
	}
	
	public double getWidth()
	{
		return (width);
	}
	
	public double getHeight()
	{
		return (height);
	}
	
	public double rectArea()
	{
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
	
	public boolean equals(Object rect)
	{	
		Rectangle userrect = (Rectangle) rect;
		
		
		if ((userrect.getWidth() == width && userrect.getHeight() == height)||(userrect.getWidth() == height && userrect.getHeight() == width))
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public String toString()
	{
		String rect;
		rect = "The rectangle has a width of " + width + " and a height of " + height;
		
		return(rect);
	}
}
