package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/**
 * @author mmcgarg
 * 
 *         link: https://leetcode.com/problems/merge-two-sorted-lists/
 *
 */
public class Problem0021MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l2 == null) {
			return l1;
		} else if (l1 == null) {
			return l2;
		}

		ListNode l1Temp = l1.val > l2.val ? l2 : l1;

		while (l1 != null) {
			ListNode l1Next = l1.next;
			boolean move = true;
			while (l2 != null) {
				ListNode l2Next = l2.next;

				if (l1.val <= l2.val && (l1.next == null || l1.next.val >= l2.val)) {
					l1.next = l2;
					l2.next = l1Next;
					l2 = l2Next;
					move = false;
					break;
				} else if (l1.val > l2.val) {
					l2.next = l1;
					l1 = l2;
					l2 = l2Next;
					move = false;
					break;
				} else {
					break;
				}
			}
			if (move)
				l1 = l1.next;
		}

		if (l2 == null) {
			return l1Temp;
		} else {
			return null;
		}
	}

}
