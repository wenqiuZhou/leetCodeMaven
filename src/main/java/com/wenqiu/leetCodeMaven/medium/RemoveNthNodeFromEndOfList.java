package com.wenqiu.leetCodeMaven.medium;

import java.util.ArrayList;

import com.wenqiu.test.dataStructures.ListNode;

public class RemoveNthNodeFromEndOfList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ArrayList<ListNode> list=new ArrayList<ListNode>();
	        
	        while(head!=null) {
	        	list.add(head);
	        	head=head.next;
	        }
	        int len=list.size();
	        list.get(len-n-1).next=list.get(len-n).next;
	        return list.get(0);
		 
	    }
}
