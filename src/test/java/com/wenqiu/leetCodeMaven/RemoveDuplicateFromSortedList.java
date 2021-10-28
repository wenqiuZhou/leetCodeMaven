package com.wenqiu.leetCodeMaven;

import java.util.Iterator;
import java.util.TreeSet;

import com.wenqiu.test.dataStructures.ListNode;

public class RemoveDuplicateFromSortedList {
	  public ListNode deleteDuplicates(ListNode head) {
	        TreeSet<Integer> set=new TreeSet<>();
	        while(null!=head) {
	        	set.add(head.val);
	        	head=head.next;	       
	        	}
	       
	        Iterator<Integer> it=set.iterator();
	        head=new ListNode(it.next());
	        ListNode next=head;
	        while(it.hasNext()) {
	        	next.next=new ListNode(it.next());
	        	next=next.next;
	        }
	        return head;
	    }
	  public ListNode deleteDuplicates2(ListNode head) {
	     ListNode current=head;
	     ListNode next=current.next;
	     while(null!=next) {
	    	 if(current.val==next.val) {
	    		 current.next=next.next;
	    		 
	    	 }else {
	    		 current=next; 
	    	 }
	    	 next=current.next;
	     }
	     return head;
	    }

}
