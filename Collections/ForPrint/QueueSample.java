package com.gl.colls;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
	
	Queue <String> myQueue = new PriorityQueue<String>();
	
	public void populateQueue()
	{
		myQueue.add("Amarendra");
		myQueue.add("Rajendra");
		myQueue.add("Kishore Kumar");
		myQueue.add("Mahendra");
		myQueue.add("Rajat Kumar");
		myQueue.add("Suman Kumar");
		
	}

	public void fetchQueueThruIterator()
	{
		Iterator <String> qIter = myQueue.iterator();
		while(qIter.hasNext())
		{
			String myStr = qIter.next();
			System.out.println(myStr);
		}
	}
	public void fetchThroughRemove()
	{
		System.out.println("The Queue Size "+myQueue.size());
		while(myQueue.isEmpty() == false)
		{
			String qStr = myQueue.remove();
			System.out.println("Removed Object "+qStr);
			
		}
		
		System.out.println("The Queue Size after Removal of all elements "+myQueue.size());
	}
	public void fetchThroughPeek()
	{
		System.out.println("Fetching Through Peek");
		String peekedObject = myQueue.peek();
		System.out.println("Peeked Object "+peekedObject);
		System.out.println("Object Removed "+myQueue.remove());
		System.out.println("Next peeked Object "+myQueue.peek());
		System.out.println("Next Removed Object "+myQueue.remove());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample queues = new QueueSample();
		queues.populateQueue();
		queues.fetchQueueThruIterator();
		queues.fetchThroughRemove();
		queues.populateQueue();
		queues.fetchThroughPeek();
	}

}
