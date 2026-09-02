package com.krtk;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		Node head=first;
		
		Node current=head;
		
		reverseNode(head);
		
		while (current!=first)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.println("NULL");
	}
	
	static  void reverseNode(Node node) {
		if(node==null) {
			return;
		}
		reverseNode(node.next);
		System.out.print(node.data+"->");
	}

}

package com.krtk;

public class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}

}

