package arrays_exercises;

public class CircularLList {
	static class Node
	{
	    int data;
	    Node next;
	};
	 
	static Node addToEmpty(Node last, int data)
	{
	    // This function is only for empty list
	    if (last != null)
	    return last;
	 
	    // Step 1: Creating a node dynamically.
	    Node temp = new Node(); 
	 
	    // Step 2:  Assigning the data.
	    temp.data = data;
	    last = temp;
	 
	    // Step 3: Creating the link.
	    last.next = last;
	 
	    return last;
	}
	 
	static Node addBegin(Node last, int data)
	{
	    if (last == null)
	        return addToEmpty(last, data);
	 
	    Node temp = new Node();//current newly made node
	 
	    temp.data = data;// assign data to new node (temp object element is the new wanted element)
	    temp.next = last.next;//point new node to last (previous) node (Remember: .next here refers to node so temp.next is "current node"
	    //so temp "current" node is now considered the "last" node of the chain link
	    
	    last.next = temp;//point last node to first node ---> think of "=" as "is now"
	    //this new last(current) node is now the new value of the temp object
	    return last; //returns this "current newly made" node
	}
	 
	static Node addEnd(Node last, int data)
	{
	    if (last == null)
	        return addToEmpty(last, data);
	     
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.next = last.next;
	    last.next = temp;
	    last = temp;
	 
	    return last;
	}
	 
	//established node elements(2, 4, 6, 8, 12)
	static Node addAfter(Node last, int data, int item)//we wanted it to be (last, 10, 8)
	//we want to add 10 after element 8
	{
	    if (last == null)
	        return null;
	 
	    Node temp, p;//variables declared
	    p = last.next;//p variable is now declared as the last node
	    do//so
	    {
	    	//if parameter-defined item matches a previous list value in the chain
	        if (p.data == item)//p.data points to class data variable-->
	        	//if p (last node)'s data is item (previous element to be followed---in this case 8) 
	        {//then create a new node
	            temp = new Node();//current newly made node (only possible because we declared temp previously in the method)
	            
	       //configure parameter-defined data to new node
	            temp.data = data;//new node's element(class variable) is the wanted element
	           
	       //define the chain algorithm
	            temp.next = p.next;//this new node is now the last node's node (which was previously the "last" node declared earlier)
	            //in other words, this new temp node is now considered the last node after the previously declare node element 
	            p.next = temp;//this p node is now the value of the temp object.
	            
	       //configure the parameter-defined "node" as new node (last)
	            if (p == last)//if p node is last(wanted node)
	                last = temp;//this last(wanted node) is now the temp object
	            return last; //return this declared wanted node
	        }
	      //this newly daclared last node (10), after following the previous node (8), will now point to the next node (12)
	        p = p.next;
	      
	      //if parameter-defined item does not match any previous list value in the chain  
	    } while(p != last.next);
	 
	    System.out.println(item + " not present in the list.");
	    return last;
	 
	}
	 
	static void traverse(Node last)
	{
	    Node p;
	 
	    // If list is empty, return.
	    if (last == null)
	    {
	        System.out.println("List is empty.");
	        return;
	    }
	 
	    // Pointing to first Node of the list.
	    p = last.next;
	 
	    // Traversing the list.
	    do
	    {
	        System.out.print(p.data + " ");
	        p = p.next;
	 
	    }
	    while(p != last.next);
	 
	}
	 
	// Driven code
	public static void main(String[] args)
	{
	    Node last = null;
	 
	    last = addToEmpty(last, 6);
	    last = addBegin(last, 4);
	    last = addBegin(last, 2);
	    last = addEnd(last, 8);
	    last = addEnd(last, 12);
	    last = addAfter(last, 10, 8);
	 
	    traverse(last);
	}
}
