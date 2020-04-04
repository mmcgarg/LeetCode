package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Problem1TwoSumTest {

	@Test(description = "valid test case")
	public void twoSumTest() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] output = Problem1TwoSum.twoSum(nums, target);
		int[] expected = { 0, 1 };

		Assert.assertEquals(output, expected);
	}
}
