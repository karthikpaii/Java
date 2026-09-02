package com.leetcode;

public class CycleDetection {
	
	static boolean hasCycle(Node head) {
		
		if(head==null) { return false; }
		Node temp1=head;
		Node temp2=head.next;
		
		
		while(temp1!=temp2) {
			
			if(temp1==null || temp2==null) {
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next.next;
		} 
		return true;
	}
	
	
	public static void main(String[] args) {
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		
		head.next.next.next.next=head.next;
		System.out.println(hasCycle(head));
	}
}
