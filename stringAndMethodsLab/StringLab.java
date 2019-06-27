// Author: Edna Jaqueline Zablah

package stringAndMethodsLab;
import stringAndMethodsLab.StringMethods;
import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Capitalize method");
		System.out.println("Please Enter a Word to capitalize:");
		String userInput = scnr.next();
		System.out.println(StringMethods.capitalize(userInput));
		scnr.nextLine();
		
		System.out.println("Where is Waldo method");
		System.out.println("Enter a phrase that contains anywhere the word Waldo:");
		String phrase = scnr.nextLine();
		System.out.println("Index of Waldo in your phrase is: " + StringMethods.wheresWaldo(phrase));
		
		
		String word1;
		String word2;
		System.out.println("First things first method");
		System.out.println("Enter first word:");
		word1 = scnr.next();
		System.out.println("Enter second word:");
		word2 = scnr.next();
		System.out.println(StringMethods.firstThingsFirst(word1, word2));
		
		
		
		System.out.println("Reverse method");
		System.out.println("Enter a word:");
		userInput = scnr.next();
		System.out.println(StringMethods.reverse(userInput));

		
		
		System.out.println("So long method");
		System.out.println("Enter first word:");
		word1 = scnr.next();
		System.out.println("Enter second word:");
		word2 = scnr.next();
		StringMethods.soLong(word1, word2);
		scnr.nextLine();
		
		System.out.println("After math method");
		System.out.println("Enter a phrase:");
		userInput = scnr.nextLine();
		System.out.println(StringMethods.afterMath(userInput));
		
		
		System.out.println("Letterize method.");
		System.out.println("Enter a word:");
		userInput = scnr.next();
		StringMethods.letterize(userInput);
			
		scnr.close();
	}
	
	
}
