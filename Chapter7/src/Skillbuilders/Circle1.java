package Skillbuilders;

public class Circle1 {
	
private static final double PI = 3.14;
private double radius;
/*
public Circle1() {
	radius = 1;
}
*/

public Circle1(double r) {
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
	System.out.print("The formula for the area of a circle is area = PI*r*r");
}
}




