package com.gl.colls;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSample {

	Deque <String> myDeque = new ArrayDeque();
	
	public void populateDeque()
	{
		myDeque.add("Amarendra");
		myDeque.add("Rajendra");
		myDeque.add("Kishore Kumar");
		myDeque.add("Mahendra");
		myDeque.add("Rajat Kumar");
		myDeque.add("Suman Kumar");
		
	}
	public void fetchDeque()
	{
		System.out.println("Deque before Removal ....");
		System.out.println(myDeque);
		myDeque.remove();
		System.out.println("Deque after Removal ....");
		System.out.println(myDeque);
		myDeque.removeFirst();
		System.out.println("Deque after Removing First ");
		System.out.println(myDeque);
		myDeque.removeLast();
		System.out.println("Deque after Removing Last ");
		System.out.println(myDeque);
		
	}
	public void fetchDequeUsingRemove()
	{
		System.out.println("------------fetching Deque using Remove-------------");
		while(myDeque.isEmpty() == false)
		{
			String deqStr = myDeque.remove();
			System.out.println(deqStr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DequeSample ds = new DequeSample();
		ds.populateDeque();
		ds.fetchDeque();
		ds.populateDeque();
		ds.fetchDequeUsingRemove();
	}

}
