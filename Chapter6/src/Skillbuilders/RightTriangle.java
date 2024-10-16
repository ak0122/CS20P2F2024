package Skillbuilders;

public class RightTriangle {
	 public static void drawBar(int length) {

	 for (int i = 1; i <= length; i++) {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
	 public static void main(String[] args) {

	 /* draw a right triangle with base size 6 */
	 for (int i = 1; i <= 6; i++) {
	 drawBar(i);
	 }
	 }
	}
