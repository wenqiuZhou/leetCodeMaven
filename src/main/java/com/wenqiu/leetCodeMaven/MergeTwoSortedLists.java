package com.wenqiu.leetCodeMaven;
/*
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
*/

import com.wenqiu.test.dataStructures.ListNode;

public class MergeTwoSortedLists {
	//
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode result = new ListNode();
		ListNode temp = result;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				temp = temp.next;
				l1 = l1.next;
			} else {
				temp.next = l2;
				temp = temp.next;
				l2 = l2.next;

			}
		}
		if (l1 != null) {
			temp.next = l1;
		}
		if (l2 != null) {
			temp.next = l2;
		}
		return result.next;
	}
	//Memory Usage more than the last one
	public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {

		if(l1==null)return l2;
		if(l2==null) return l1;
		if(l1.val<=l2.val) {
			return(new ListNode(l1.val,mergeTwoLists(l1.next, l2)));
		}else{
			return(new ListNode(l2.val,mergeTwoLists(l1, l2.next)));
		}
	}
}
