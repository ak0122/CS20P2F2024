package Mastery;

public class Search {
//Search Class apart of the Grades Application
	
	 public static int linear(String[] array, String wordToFind) {
		 int index = 0;
		 
		 while ((array[index] != wordToFind) &&
		 (index < array.length - 1))
		 {
		 index += 1;
		 }

		 if (array[index] == wordToFind)
		 {
		 return(index);
		 } 
		 
		 else {
		 return(-1);
	}
}
}
