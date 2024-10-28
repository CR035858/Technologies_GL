package com.gl.colls;

import java.util.Stack;

public class StackSample {

	Stack <String> myStack = new Stack<>();
	
	public void populateStack()
	{   // stack    queue
		// pop --- remove 
		// peek --- peek
		
		myStack.push("Amarendra");
		myStack.push("Rajendra");
		myStack.push("Kishore Kumar");
		myStack.push("Mahendra");
		myStack.push("Rajat Kumar");
		myStack.push("Suman Kumar");
	}
	public void popStack()
	{
		System.out.println("size is before removal "+myStack.size());
		while(myStack.isEmpty() == false)
		{
			String poppedStr = myStack.pop();
			System.out.println("Popped String is "+poppedStr);
		}
		System.out.println("size is after removal "+myStack.size());
		
	}
	public void peekStack()
	{
		System.out.println("size is before peeking one Obejct "+myStack.size());
		String peekedStr = myStack.peek();
		System.out.println("The Peeked Object is "+peekedStr);
		System.out.println("size is after peeking one Obejct "+myStack.size());
		System.out.println("Removed 1 Object "+myStack.pop());
		System.out.println("size is after popping  one Obejct "+myStack.size());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSample ss = new StackSample();
		ss.populateStack();
		ss.popStack();
		ss.populateStack();
		ss.peekStack();
		
	}

}
