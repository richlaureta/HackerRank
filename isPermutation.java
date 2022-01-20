package checkPermutation;
/* Programmer: Richmond Laureta
 * Questions: Check Permutation - Given two Strings, write a method to decide if one is a permutation
 * of the other.
 */
public class isPermutation {
	
	public boolean isPermutation(String phrase1, String phrase2) {
		if (phrase1.length() != phrase2.length()) {
			return false;
		}
		
		int total1 = 0;
		int total2 = 0;
		
		for (int i = 0; i < phrase1.length(); i++) {
			int val1 = phrase1.charAt(i);
			int val2 = phrase2.charAt(i);
			
			total1 = total1 + val1;
			total2 = total2 + val2;
	
		}
		
		if (total1 == total2) {
			return true;
		}
		return false;
	}
}
