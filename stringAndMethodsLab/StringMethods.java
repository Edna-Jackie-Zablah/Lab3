// Author: Edna Jaqueline Zablah

package stringAndMethodsLab;

public class StringMethods {

public static String capitalize (String word) {
		
      	word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		
		return word;
	}	
	
	
	public static int wheresWaldo(String phrase) { 
		
		String word = "Waldo";
	    
		int indexOfWaldo = phrase.indexOf(word);
		return indexOfWaldo;
	}
	    		
	
  public static String firstThingsFirst(String first, String second) {
	   	      
	   if (first.charAt(0) <= second.charAt(0)) {
		   return (first + " " + second);
	   }else {
		   return (second + " " + first);
	   }
	   
	   
   }
	   
	
  public static String reverse(String word) {
		
		return (new StringBuilder(word).reverse().toString());
		
	}
	   
  			
		
	
	public static void soLong(String first, String second) {
		
		if (first.length() > second.length() ) {
			System.out.println(first);
		}else if (first.length() < second.length() ) {
				System.out.println(second);
		}else {
			System.out.println(first + " " + second);
		}	
	}	
		
	
		
	public static String afterMath(String phrase) {
		
		String word ="math";
		if (phrase.contains(word)) {
			return (phrase.substring(phrase.indexOf(word)));
		}else {
			return ("dud");
		}
	}
		
	
	
	public static void letterize(String word) {
		
		for (int i=0; i < word.length(); i++) {
			System.out.println(word.substring (i, i+1));
		}
	}
	

	
	
}
