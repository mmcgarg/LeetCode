package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         Problem's details: https://leetcode.com/problems/two-sum/
 *
 */
public class Problem1TwoSum {
	private static final Logger logger = LogManager.getLogger(Problem1TwoSum.class);

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> complimentValues = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (complimentValues.containsKey(nums[i])) {
				return new int[] { complimentValues.get(nums[i]), i };
			}
			complimentValues.put(target - nums[i], i);
		}

		return new int[0];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] twoSum = Problem1TwoSum.twoSum(nums, target);

		logger.info(Arrays.toString(twoSum));

	}
}