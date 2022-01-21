/* Programmer: Richmond Laureta
 * Question 1.3: URLify - Write a method to replace all spaces in a string with ‘%20’. 
 * You may assume that the string has sufficient space at the end to hold the additional characters, 
 * and that you are given the “true” length of the string. 
 * (Note: If implementing in Java, please use a character array so that you can perform 
 * this operation in place.) Example: Input - “Mr John Smith     “, 13 Output- “Mr%20John%20Smith”
 */
public class URLify {
	
	public void URLify(String phrase) {
		
		String replace = phrase.trim(); 				//Trims the string of spaces at the end
		String tru = replace.replaceAll(" ", "%20");	//Replaces all spaces %20
		
		System.out.println(tru);						//Prints out the tru String
		
		System.out.println("The true length of a string is: " + replace.length());			//Prints out the true length of the string
		
		
		
	}
	
}
