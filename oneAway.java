package oneAway;

/*Programmer: Richmond Laureta
 * Question: 1.5 - One away - There are three types of edits that can be performed on strings: insert a 
 * character, remove a character, or replace a character. Given two strings, write a function 
 * to check if the are one edit (or zero edits) away. 
 * Example: pale, ple —> true | pales, pale —> true | pale, bale —> true | pale, bake —> false
 */
public class oneAway {
	
	public boolean oneAway (String string1, String string2) {
		
		String str1 = string1.toLowerCase();			//lowers the case of the letters
		String str2 = string2.toLowerCase();
		
		int edit = 0; 									//Counts the number of edit 
		int match = 0;									//counts the number of match
		
		if(str1 == str2) {								//if they are the same it returns true
			return true;
		}

		if(str1.length() == str2.length() || str1.length()-str2.length() == 1 || str2.length()-str1.length() == 1) {		//condtions
			if (str1.length() == str2.length()) {
				for(int i = 0; i <str1.length(); i++) {
					if(str1.charAt(i) == str2.charAt(i)) {
						continue;
					}
					
					else if (str1.charAt(i) != str2.charAt(i)) {
						edit++;
					}
				}
				if (edit > 1) {
					return false;
				}
				else return true;
			}
			
			if(str1.length()-str2.length() == 1 || str2.length()-str1.length() == 1) {
				try{															//try and catch block for str2 not in range of str1
					for (int i = 0; i < str1.length(); i++) {
					if(str1.charAt(i) == str2.charAt(match)) {
						match++;												// increment match if it matches	
						
					}
					else if (str1.charAt(i) != str2.charAt(match)) {
						edit++;													//increment edit if it does not match
						
					}	
				}
					
			}	catch (Exception e){
				if (match >= str2.length() - 1 && edit <= 1) {
					return true;
				}
				else {return false;}
				
			}
				if (match >= str2.length() - 1 && edit <= 1) {
					return true;
				}
				else {return false;}

			}
		}
		return false;
	}
}