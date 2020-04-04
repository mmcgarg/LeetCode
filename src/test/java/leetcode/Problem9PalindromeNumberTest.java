package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem9PalindromeNumberTest {

	@Test
	public void isPalindromeTest() {
		boolean palindrome = Problem9PalindromeNumber.isPalindrome(123);

		assertEquals(palindrome, false);
	}

	@Test
	public void isPalindromeTest2() {
		boolean palindrome = Problem9PalindromeNumber.isPalindrome(121);

		assertEquals(palindrome, true);
	}

	@Test
	public void isPalindromeTest3() {
		boolean palindrome = Problem9PalindromeNumber.isPalindrome(-121);

		assertEquals(palindrome, false);
	}
}
