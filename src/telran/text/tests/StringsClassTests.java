package telran.text.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {
	private static final int N_RUNS = 10;
	private static final int N_STRINGS = 10;

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str5 = "98Tt,321";
		String str4 ="kugy";
		int expected1[] = {8, 0};
		int expected2[] = {1, 1};
		int expected3[] = {0, 8};
		int expected4[] = {0, 0};
		assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
	assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
		assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
	}
//	@Test 
//	void isAnagramTests() {
//		String str1 = "Hello";
//		String str2 = "Helll";
//		String str3 = "eloHl";
//		String str4 = "Helo";
//		assertTrue(Strings.isAnagram(str1, str3));
//		assertFalse(Strings.isAnagram(str1, str2));
//		assertFalse(Strings.isAnagram(str1, str4));
//		assertTrue(Strings.isAnagram(str1, str1));
//	}
	
	
	
	@Test
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}
	@Test
	void joinPerformanceTest() {
		String array[] = getBigArray();
		for(int i = 0; i < N_RUNS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for (int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
	@Test
	void matchesTest() {
		//TODO
		String match="match";
		String nomatch="nomatch";
		assertEquals(match, Strings.matches("David", "david"));
		assertEquals(match, Strings.matches("John F ", "John Fitzgerald"));
		assertEquals(nomatch, Strings.matches("John K ", "John F "));
		assertEquals(match, Strings.matches("John Fitzgerald", "John Fitzgerald"));
		assertEquals(match, Strings.matches("Anna Maria Magdalena", "Anna Magdalena"));
		assertEquals(match, Strings.matches("Anna Maria Magdalena", "Maria Magdalena"));
		assertEquals(nomatch, Strings.matches("Anna Maria Magdalena", "Anna Maria Roberta"));
		assertEquals(nomatch, Strings.matches("Anna Maria Magdalena", "Anna Magdalena Roberta"));
		
	
	}
	@Test
	void sortStringsAsNumbersTest() {
		//TODO
		String arr[]= {"10","5","26","9","84","50","42"};
		String expected[]= {"5","9","10","26","42","50","84"};
		Strings.sortStringsAsNumbers(arr);
		assertArrayEquals(expected, arr);
	}
	

}

