/**
 * 
 */
package leetcode;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0066PlusOne {
	private static final Logger logger = LogManager.getLogger(Problem0066PlusOne.class);

	private Problem0066PlusOne() {

	}

	public static int[] plusOne(int[] digits) {
		logger.info("Input array: {}", Arrays.asList(digits));

		if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			return digits;
		}

		int carryValue = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
				carryValue = 1;
			} else {
				digits[i] += carryValue;
				break;
			}
		}

		if (digits[0] == 0) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				result[i + 1] = digits[i];
			}

			logger.info("Output array: {}", Arrays.asList(result));
			return result;
		}

		logger.info("Output array: {}", Arrays.asList(digits));
		return digits;
	}

}
