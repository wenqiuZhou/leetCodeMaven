package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;

import com.wenqiu.test.dataStructures.ListNode;

public class InsersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == headB)
			return headA;
		
		List<ListNode> linkANotes=new ArrayList<ListNode>();

		List<ListNode> linkBNotes=new ArrayList<ListNode>();
		
		while(headA!=null) {
			linkANotes.add(headA);
			headA=headA.next;
		}
		while(headB!=null) {
			linkBNotes.add(headB);
			headB=headB.next;
		}
		int lenA=linkANotes.size();
		int lenB=linkBNotes.size();
		
		if(linkANotes.get(lenA-1)!=linkBNotes.get(lenB-1))
			return null;
		else {
	
		for(int i=lenA-1,j=lenB-1;i>=0&&j>=0;i--,j--) {
				if(linkANotes.get(i)==linkBNotes.get(j)) {
					if(i==0||j==0)
						return linkANotes.get(i);
					continue;
				}
				return linkANotes.get(i+1);
			
		}
		
	}
		return null;
	}
}
