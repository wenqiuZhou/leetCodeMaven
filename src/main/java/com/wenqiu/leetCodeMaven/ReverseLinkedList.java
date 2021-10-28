package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		 if (head == null || head.next == null)
				return head;
			ListNode first, second,temp;
			first = head;
			second = first.next;
	        head.next=null;
			while (second!= null) {
				if(second.next==null) {
					second.next=first;
					return second;
				}
					
				temp = second.next;
				second.next=first;
				first=temp.next;
	            temp.next=second;
	            if(first==null)
	                return temp;
	            else{
	                second=first.next;
	                first.next=temp;
	            }
				
			}
			return first; 
	}
}
