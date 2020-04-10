package leetcode;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 *         link:https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class Problem0026RemoveDuplicatesfromSortedArray {
	private static final Logger logger = LogManager.getLogger(Problem0026RemoveDuplicatesfromSortedArray.class);

	private Problem0026RemoveDuplicatesfromSortedArray() {

	}

	public static int removeDuplicates(int[] nums) {
		logger.info("Input numbers: {}", Arrays.asList(nums));

		if (nums == null || nums.length == 0)
			return 0;

		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}

		logger.info("Output numbers: {}", Arrays.asList(nums));

		return i + 1;

	}
}
