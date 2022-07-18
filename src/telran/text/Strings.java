package telran.text;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

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
//	public static boolean isAnagram(String str1, String str2) {
//		boolean res=false;
//		String[] str1Array = null;
//		str1Array = str1.split("");
//		String[] str2Array = null;
//		str2Array = str2.split("");
//		int sumAllIndexArray=0;
//		int numbersOfSame=0;
//		int b[]=new int[str2Array.length];
//		if(str1Array.length!=str2Array.length) {
//			//break;
//		}
//		int index0=str1.indexOf(str2Array[0]);
//		if(index0!=0) {return false;} 
//		for(int i=0;i<str1Array.length;i++) {
//			sumAllIndexArray+=i;
//		}
//		for(int i=0;i<str1Array.length;i++) {
//			int index=str1.indexOf(str2Array[i]);
//			if (index>0 && includes(b,index)) {
//				b[i]=index;
//				numbersOfSame+=index; 
//			} 
//		}
//		if(sumAllIndexArray==numbersOfSame) {
//			res=true; 
//		}
//		System.out.println(sumAllIndexArray);
//		System.out.println(numbersOfSame);
//		return res;
//
//	}
//	public static boolean includes(int arr[],int num) {
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]==num) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	static public String join(String[] array, String delimiter) {
		//STring "+" operator based solution
		return stringPluseSolution(array, delimiter);
		//StringBuilder attend based solution
		//return stringBuilderSolution(array, delimiter);
	}
	static private String stringBuilderSolution(String[] array, String delimiter) {
		StringBuilder strBuilder = new StringBuilder(array[0]);
		for(int i = 1; i < array.length; i++) {
			strBuilder.append(delimiter).append(array[i]);
		}
		return strBuilder.toString();
	}
	static private String stringPluseSolution(String[] array, String delimiter) {
		String res = array[0]; //assumption: there is at least one string
		for(int i = 1; i < array.length; i++) {
			res += delimiter + array[i] ;
		}
		return res;
	}
	/**
	 * 
	 * @param name1 -  first name 
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {
		//TODO
		String matchOrNotMatch[]= {"match","nomatch"};
		String arrWords1[]=name1.toLowerCase().split(" ");
		String arrWords2[]=name2.toLowerCase().split(" ");
		
		int concatArrays=arrWords1.length+arrWords2.length;
		System.out.println(concatArrays);
//		if(firstLastNameEquals(arrWords1,arrWords2)) {
//			return matchOrNotMatch[0]; 
//		}
			if((arrWords1[arrWords1.length-1].compareTo(arrWords2[concatArrays-1]))==0 && 
					arrWords1[concatArrays-arrWords2.length-1].startsWith(arrWords2[arrWords1.length-1])&&
					((arrWords1[concatArrays-arrWords2.length-1].length()<1) ||
					(arrWords2[arrWords1.length-1].length()<1))) {
				return matchOrNotMatch[0];
			}
		
		
				
//		System.out.println(arrWords1[1]);
//		System.out.println(arrWords2[1]);
//		if(allEgual(arrWords1,arrWords2)|| firstLetterEquals(arrWords1,arrWords2)|| firstLastNameEquals(arrWords1,arrWords2)){
//			return matchOrNotMatch[0];}
		
		
		return matchOrNotMatch[1];
	}
	
	private static boolean firstLastNameEquals(String[] arrWords1, String[] arrWords2) {
		int count=0;
		for(int i=0;i<arrWords1.length;i++) {
			if(arrWords1.length==arrWords2.length && arrWords1[i].compareTo(arrWords2[i])==0 ) {
				count++;
			}
		}
		if(count==arrWords1.length) {
			return true;
		}
		
		return false;
	}

//
//	private static boolean firstLetterEquals(String[] arrWords1, String[] arrWords2) {
//		     if(arrWords1[arrWords1.length-1].length()<arrWords2[arrWords2.length].length()&& 
//				arrWords1[arrWords1.length-1].length()>arrWords2[arrWords2.length].length()) {
//		    	 for(int i=0;i<arrWords1.length;i++) {
//		    		 
//		    	 }
//		     }
//		return false;
//	}

	private static boolean allEgual(String[] arrWords1, String[] arrWords2) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * sorts array of strings
	 * @param strNumbers array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be greater than string containing "23" as the number 123 greater than
	 * number 23
	 */
	static public void sortStringsAsNumbers(String[] strNumbers) {
		 String min = "";
		    for (int i = 0; i < strNumbers.length; i++){
		        min = strNumbers[i];
		        int indexMin = i;
		        for (int j = i + 1; j < strNumbers.length; j++){
		            if (strNumbers[j].length() < min.length()){
		                min = strNumbers[j];
		                indexMin = j;
		            }else if (strNumbers[j].length() == min.length()){
		                for (int x = 0; x < strNumbers[j].length(); x ++){
		                    if (strNumbers[j].charAt(x) < min.charAt(x)){
		                        min = strNumbers[j];
		                        indexMin = j;
		                    }
		                    else if (strNumbers[j].charAt(x) > min.charAt(x)){
		                        break;
		                    }
		                }
		            }
		        }
		    }
	
		            
		        
//		        if (indexMin != i){
//		            String temp = strNumbers[i];
//		            strNumbers.set(i, min);
//		            strNumbers.set(indexMin, temp);
//		        }
		                    
		 

		 

//		  Arrays.sort(strNumbers, new Comparator<String>() {
//		    public int compare(String a1, String a2) {
//		        BigDecimal a = new BigDecimal(a1);
//		        BigDecimal b = new BigDecimal(a2);
//		        return a.compareTo(b);
//		    }
//		  });
		        
	}		            
}

