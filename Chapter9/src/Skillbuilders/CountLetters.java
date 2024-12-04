package Skillbuilders;
import java.util.Scanner;
public class CountLetters {

	public static void main(String[] args) {

		 final int LOW = 'A'; //smallest possible value
		 final int HIGH = 'Z'; //highest possible value
		 int[] letterCounts = new int[HIGH - LOW + 1];
		 Scanner input = new Scanner(System.in);
		 String phrase;
		 char[] phraseLetters;
		 int offset; //array index

		
		 /* prompt user for a phrase */
		 System.out.print("Enter a phrase: ");
		 phrase = input.nextLine();

		 /* convert word to char array and count letter occurrences */
		 phrase = phrase.replaceAll("\\W", "").toUpperCase();
		 phraseLetters = phrase.toCharArray();
		 for (int letter = 0; letter < phraseLetters.length; letter++) {
		 offset = phraseLetters[letter] - LOW;
		 letterCounts[offset] += 1;
		 }

		 /* show letter occurrences */
		 for (int i = LOW; i <= HIGH; i++) {
		 System.out.println((char)i + ": " + letterCounts[i - LOW]);
		 }
		 }
		}

