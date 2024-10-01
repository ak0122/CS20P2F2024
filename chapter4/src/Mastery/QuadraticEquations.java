import java.text.DecimalFormat;
import java.util.*;
import java.math.*;

public class QuadraticEquations {

	public static void main(String[] args)
	{
		//Declaration
		double a,b,c,x_1,x_2,x_real,x_im,D;
		
		//Decimal format
		DecimalFormat df = new DecimalFormat("0.00");
		
		//Prepare for user input
		Scanner UserInput = new Scanner(System.in);
		
		//ask user for values of a,b, and c
		System.out.print("Enter the value of a: ");
		a = UserInput.nextDouble();
		
		System.out.print("Enter the value of b: ");
		b = UserInput.nextDouble();
		
		System.out.print("Enter the value of c: ");
		c = UserInput.nextDouble();
		
		//Calculate the value of the discriminant
		D = Math.pow(b,2)- 4*a*c;
		
		//Print the actual equation
		System.out.print("The equation is "+a+"x^2 + "+b+"x + "+c+" = 0");
		
		//if-else-if statement for three diff. cases
		if (D > 0) {
			//calculate both roots
			x_1 = (-b + Math.sqrt(D))/(2*a);
			x_2 = (-b - Math.sqrt(D))/(2*a);
			
			//Print out the roots
			System.out.print("\nThe roots are "+ df.format(x_1)+" AND "+df.format(x_2));
			
		}
		
		else if (D == 0) {
			//calculate the single root
			x_1 = -b/(2*a);
			
			// Print out the single root
			System.out.print("\nThe ONLY root is "+ df.format(x_1));	
		}
		else {
			//calculate imaginary roots
		x_real = -b/(2*a);
		x_im = (Math.sqrt(Math.abs(D)))/(2*a);
		
		//print out roots
		
		System.out.print("\nThe 2 IMAGINARY roots are "+ df.format(x_real)+"±"+df.format(x_im)+"i");
				
		}
		/*
		 *  Test Case 1
		    Enter the value of a: 2
			Enter the value of b: 4
			Enter the value of c: -4
			The equation is 2.0x^2 + 4.0x + -4.0 = 0
			The roots are 0.73 AND -2.73
			
			Test Case 2
			Enter the value of a: 2
			Enter the value of b: 4
			Enter the value of c: 2
			The equation is 2.0x^2 + 4.0x + 2.0 = 0
			The ONLY root is -1.00
			
			Test Case 3
			Enter the value of a: 4
			Enter the value of b: 3
			Enter the value of c: 5
			The equation is 4.0x^2 + 3.0x + 5.0 = 0
			The 2 IMAGINARY roots are -0.38±1.05i
		 */
	}
}
