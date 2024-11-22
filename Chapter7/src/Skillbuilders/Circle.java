package Skillbuilders;

public class Circle {
	
private static final double PI = 3.14;
private double radius;

//constructor method
public Circle() {
	radius = 1;
}

public Circle(double r) {
	 radius = r;
	 }

public void setRadius(double newRadius) {
	radius = newRadius;
}

public double area() {
	double circleArea;
	
	circleArea = PI*radius*radius;
	return(circleArea);
}

public double getRadius() {
	return(radius);
}
//Skill builder CirclePt1
public double circumference() {
	
double circleCircumference = 2*PI*radius;

return(circleCircumference);
}

public static void displayAreaFormula() {
	System.out.println("The formula for the area of a circle is area = PI*r*r");	
}

public boolean equals(Object obj)
{
	Circle userObj = (Circle)obj ;
	
	if (userObj.getRadius() == radius)
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
		String circle;
		
		circle = "The Circle has a radius of " + radius ;
		
		return (circle);	
}
	
}




