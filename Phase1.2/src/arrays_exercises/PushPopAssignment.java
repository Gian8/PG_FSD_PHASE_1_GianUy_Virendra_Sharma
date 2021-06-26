package arrays_exercises;

import java.util.Stack;

public class PushPopAssignment { 
	 static void stack_push(Stack<Integer> stack) { 	 // Pushing element on the top of the stack
		 System.out.println("Push Operation:"); 
	     for(int i = 0; i < 7; i++) { 
	         stack.push(i); 
	         System.out.println("Element " + i + " is now on top stack");
	     } 
	 } 	   	  
	 static void stack_pop(Stack<Integer> stack) { // Popping element from the top of the stack
	     System.out.println("Pop Operation:"); 

	     for(int i = 0; i < 3; i++) { 
	         Integer y = (Integer) stack.pop(); 
	         System.out.println(y); 
	     } 
	 } 	 
	 static void stack_peek(Stack<Integer> stack) { // Displaying element on the top of the stack 
	     Integer element = (Integer) stack.peek(); 
	     System.out.println("Element on stack top: " + element); 
	 } 	   

	 static void stack_search(Stack<Integer> stack, int element) {// Searching element in the stack 
	     Integer pos = (Integer) stack.search(element); 

	     if(pos == -1) {
	         System.out.println("Element not found");
	     }
	     else {
	         System.out.println("Element is found at position: " + pos);
	     }
	 } 
	 public static void main (String[] args) { 
	     Stack<Integer> stack = new Stack<Integer>(); 
	     stack_push(stack); 
	     stack_pop(stack); 
	     stack_peek(stack); 
	     stack_search(stack, 2); 
	     stack_search(stack, 6); 
	 } 
}
