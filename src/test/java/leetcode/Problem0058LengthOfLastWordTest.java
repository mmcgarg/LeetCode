package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem0058LengthOfLastWordTest {

	@Test
	public void lengthOfLastWordTest() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord(null);

		assertEquals(actual, 0);
	}

	@Test
	public void lengthOfLastWordTest2() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord("");

		assertEquals(actual, 0);
	}

	@Test
	public void lengthOfLastWordTest3() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord("hello");

		assertEquals(actual, 5);
	}

	@Test
	public void lengthOfLastWordTest4() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord("he llo");

		assertEquals(actual, 3);
	}

	@Test
	public void lengthOfLastWordTest5() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord("hello world");

		assertEquals(actual, 5);
	}

	@Test
	public void lengthOfLastWordTest6() {
		int actual = Problem0058LengthOfLastWord.lengthOfLastWord(" ");

		assertEquals(actual, 0);
	}
}
