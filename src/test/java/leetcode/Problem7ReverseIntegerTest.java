package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem7ReverseIntegerTest {

	@Test
	public void reverseTest() {
		int reverse = Problem7ReverseInteger.reverse(123);

		assertEquals(reverse, 321);

		reverse = Problem7ReverseInteger.reverse(2147483647);

		assertEquals(reverse, 0);

		reverse = Problem7ReverseInteger.reverse(-2147483648);

		assertEquals(reverse, 0);
	}
}
