package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> complimentValues = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (complimentValues.containsKey(nums[i])) {
				return new int[] { complimentValues.get(nums[i]), i };
			}
			complimentValues.put(target - nums[i], i);

		}

		return null;
	}
}