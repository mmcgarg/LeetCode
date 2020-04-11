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
public class Problem0058LengthOfLastWord {
	private static final Logger logger = LogManager.getLogger(Problem0058LengthOfLastWord.class);

	private Problem0058LengthOfLastWord() {

	}

	public static int lengthOfLastWord(String s) {
		logger.info("Input string: {}", s);
		if (s == null || s.length() == 0)
			return 0;

		char[] charArray = s.toCharArray();
		int start = 0;
		int end = 0;
		boolean reset = true;
		boolean noValidChar = true;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ' && reset) {
				noValidChar = false;
				start = i;
				reset = false;
			} else if (start >= end && charArray[i] == ' ') {
				end = i;
				reset = true;
			}
		}

		if (noValidChar)
			return 0;

		return end <= start ? charArray.length - start : end - start;
	}

}
