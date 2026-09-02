package com.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeaoDemo {
  public static void main(String[] args) {
	  PriorityQueue maxHeap= new PriorityQueue<>(Collections.reverseOrder());

	  maxHeap.add(30);
	  maxHeap.add(10);
	  maxHeap.add(50);
	  maxHeap.add(20);
	  maxHeap.add(40);
	  
	  System.out.println("Min Heap"+maxHeap);
	  System.out.println("Min  Size: "+maxHeap.size());
	  System.out.println("Peek: "+maxHeap.peek());
	  System.out.println("Poll: "+maxHeap.poll());
	  
 }
  }

