package Mastery;

public class Search {
//Search Class apart of the Grades Application
	
	 public static int linear(String[] array, String wordToFind)
	 {
		 for (int i = 0; i < array.length; i++)
		 {
		        if (array[i].equals(wordToFind))
		        {
		            return i;
		        }
		 }
		    return -1;
	 }
}
