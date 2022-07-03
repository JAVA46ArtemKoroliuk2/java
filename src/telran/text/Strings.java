package telran.text;

public class Strings {
	/**
	 * 
	 * @param str1 ascii string with no repeated symbols
	 * @param str2 ascii string with no repeated symbols
	 * @return array with two numbers first - number of the symbols of the str2 that
	 *         exist in str1 at the same indexes second - number of the symbols of
	 *         the str2 that exist in str1 at different indexes
	 */
	// TODO
	// Two implementation hints
	// first: additional helper array such that array['a']
	// is an index of the symbol 'a' in str1 or -1
	// example, str1 - "ctab" then array['a'] = 2;
	// ************************************************
	// second: implementation based on the method indexOf
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int res[] = { 0, 0 };
		String[] str1Array = null;
		str1Array = str1.split("");
		String[] str2Array = null;
		str2Array = str2.split("");
		if (str1Array.length <= str2Array.length) {
			for (int i = 0; i < str1Array.length; i++) {
				if (str1Array[i].equals(str2Array[i])) {
					res[0]++;
				}
			}
			for (int i = 0; i < str1Array.length; i++) {
				int index = str1.indexOf(str2Array[i]);
				if (index>=0 && index != i) {
					res[1]++;
				}
			}
		}
		if (str1Array.length > str2Array.length) {
			for (int i = 0; i < str2Array.length; i++) {
				if (str1Array[i].equals(str2Array[i])) {
					res[0]++;
				}
			}
			for (int i = 0; i < str2Array.length; i++) {
				int index = str1.indexOf(str2Array[i]);
				if (index>=0 && index != i) {
					res[1]++;
				}
			}
		}
		
		return res;
	}

	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if : (1) str2 has the same as str1 length (2) str2 comprises of
	 *         all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {
		boolean res=false;
		String[] str1Array = null;
		str1Array = str1.split("");
		String[] str2Array = null;
		str2Array = str2.split("");
		int sumAllIndexArray=0;
		int numbersOfSame=0;
		if(str1Array.length!=str2Array.length) {
			//break;
		}
		for(int i=0;i<str1Array.length;i++) {
			sumAllIndexArray+=i;
		}
		for(int i=0;i<str1Array.length;i++) {
			for(int j=0;j<str1Array.length;j++)
			if(str1Array[i].equals(str2Array[j])) {
				
			}
			numbersOfSame+=i; 
		}
		if(sumAllIndexArray==numbersOfSame) {
			res=true;
		}
		System.out.println(sumAllIndexArray);
		System.out.println(numbersOfSame);
		return res;

	}
}
