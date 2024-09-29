package Mastery;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class MathTutor {

		public static void main(String[] args)
		{
			//declaration
			int n_1,n_2,op,ans1,ans2,ans3;
			String ans4;
			
			//setting up user input and random number
			Random random = new Random();
			Scanner UserInput = new Scanner(System.in);
			
			op = random.nextInt(4);
			n_1 = random.nextInt(10)+1;
			n_2 = random.nextInt(10)+1;
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			//addition case --> op = 0 corresponds to add
			if (op == 0) {
				System.out.print("What is " +n_1+"+"+n_2+"? ");
				ans1 = UserInput.nextInt();
				if (ans1 == n_1 +n_2) {
					System.out.print("You got the answer RIGHT! Good Job.");
				}
					else {
						System.out.print("You got the answer WRONG.");
					}}
				
				//Subtraction case --> op == 1 is subtract
				else if (op == 1) {
					System.out.print("What is " +n_1+"-"+n_2+"? ");
					ans2 = UserInput.nextInt();
					if (ans2 == n_1 - n_2) {
						System.out.print("You got the answer RIGHT! Good Job.");
					}
						else {
							System.out.print("You got the answer WRONG.");
						}
					}
			//Multiplication case --> op == 2 is subtract
				else if (op == 2) {
					System.out.print("What is " +n_1+"*"+n_2+"? ");
					ans3 = UserInput.nextInt();
					if (ans3 == n_1*n_2) {
						System.out.print("You got the answer RIGHT! Good Job.");
					}
						else {
							System.out.print("You got the answer WRONG.");
						}}
			//Division case --> op == 3 is divide
					else if (op == 3) {
						System.out.print("What is " +n_1+"/"+n_2+" to 2 decimal places? ");
						ans4 = UserInput.next();
						if (ans4.equals(df.format((double)n_1/(double)n_2))) {
							System.out.print("You got the answer RIGHT! Good Job.");
						}
							else {
								System.out.print("You got the answer WRONG.");
							}
				}	
			}
		}
