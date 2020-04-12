/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mmcgarg
 *
 */
public class Problem0118PascalTriangle {
	private static final Logger logger = LogManager.getLogger(Problem0118PascalTriangle.class);

	private Problem0118PascalTriangle() {

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		logger.info("Number of rows: {}", numRows);

		for (int i = 1; i <= numRows; i++) {
			List<Integer> row = new ArrayList<>();
			result.add(row);
			for (int j = 0; j < i; j++) {
				if (0 == j)
					row.add(j, 1);
				else if (i - 1 == j)
					row.add(j, 1);
				else if (i > 2)
					row.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
			}
		}

		logger.info("Result: {}", result);
		return result;
	}
}
