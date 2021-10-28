package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;

import com.wenqiu.test.dataStructures.ListNode;

public class PalindromeLinkedList {
	  public boolean isPalindrome(ListNode head) {
		  List<ListNode> list=new ArrayList<ListNode>();
	        while(head!=null) {
	        	list.add(head);
	        	head=head.next;
	        }
	        int len=list.size();
	        int half=len/2;
	        for(int i=0;i<half;i++) {
	        	if(list.get(i)!=list.get(len-i-1)) {
	        		return false;
	        	}
	        	
	        }
	        return true;
	    }
}
