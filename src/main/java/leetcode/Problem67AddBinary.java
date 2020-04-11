/**
 * 
 */
package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem67AddBinary {
	private static final Logger logger = LogManager.getLogger(Problem67AddBinary.class);

	private Problem67AddBinary() {

	}

	public static String addBinary(String a, String b) {
		logger.info("Input strings are: {} and {}", a, b);

		StringBuilder sb = new StringBuilder();

		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		char[] maxArray = null;
		int carry = 0;

		int min = aArray.length > bArray.length ? bArray.length : aArray.length;
		int max = aArray.length > bArray.length ? aArray.length : bArray.length;

		if (aArray.length == max) {
			maxArray = aArray;
		} else {
			maxArray = bArray;
		}

		int i = aArray.length - 1;
		int j = bArray.length - 1;

		while (true) {
			if (i < 0 || j < 0)
				break;

			if (bArray[j] == '1' && aArray[i] == '1') {
				if (carry != 0) {
					sb.insert(0, 1);
				} else {
					sb.insert(0, 0);
				}
				carry = 1;
			} else if (bArray[j] == '0' && aArray[i] == '0') {
				if (carry == 0)
					sb.insert(0, 0);
				else
					sb.insert(0, 1);
				carry = 0;
			} else {
				if (carry == 1) {
					sb.insert(0, 0);
					carry = 1;
				} else {
					sb.insert(0, 1);
					carry = 0;
				}
			}

			--i;
			--j;
		}

		for (int k = max - min - 1; k >= 0; k--) {
			if (maxArray[k] == '1' && carry == 1) {
				sb.insert(0, 0);
				carry = 1;
			} else if (maxArray[k] == '0' && carry == 1) {
				sb.insert(0, 1);
				carry = 0;
			} else {
				sb.insert(0, maxArray[k]);
			}
		}

		if (carry != 0) {
			sb.insert(0, 1);
		}

		logger.info("Output string: {}", sb);

		return sb.toString();
	}

}
