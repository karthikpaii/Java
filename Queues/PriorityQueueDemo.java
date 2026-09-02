package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
     public static void main(String[] args) {
//    	  PriorityQueue  pq= new PriorityQueue();
    	  PriorityQueue <Integer> minHeap= new PriorityQueue<>();
//    	  pq.add(10);
//    	  pq.add(9);
//    	  pq.add(12);
//    	  System.out.println(pq);
//    	  
//    	  pq.poll();
//    	  System.out.println(pq);
//    	  
//    	  pq.poll();
//    	  System.out.println(pq);
    	  
    	  minHeap.add(30);
    	  minHeap.add(10);
    	  minHeap.add(50);
    	  minHeap.add(20);
    	  minHeap.add(40);
    	  
    	  System.out.println("Min Heap"+minHeap);
    	  System.out.println("Min  Size: "+minHeap.size());
    	  System.out.println("Min Peek: "+minHeap.peek());
    	  System.out.println("Min poll: "+minHeap.poll());
    	  System.out.println("Min poll: "+minHeap.poll());
    	  
     }
}
