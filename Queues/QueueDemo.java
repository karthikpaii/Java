package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
   public static void main(String[] args) {
	   Queue<Integer> q= new LinkedList<>();
	   q.offer(10);
	   q.offer(40);
	   q.offer(60);
	   System.out.print(q);
	   System.out.print(q.peek());
	   System.out.print(q.poll());
   }
}

