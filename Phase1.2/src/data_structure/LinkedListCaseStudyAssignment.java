package data_structure;

public class LinkedListCaseStudyAssignment {
	static class Node
	{
	    int data;
	    Node node;
	};
	 
	static Node addToEmpty(Node nodeParameter, int data)
	{
	    if (nodeParameter != null)
	    	return nodeParameter;
	
	    Node Temporary = new Node(); 
	 
	    Temporary.data = data;
	    nodeParameter = Temporary;
	    nodeParameter.node = nodeParameter;	 
	    
	    return nodeParameter;
	}
	 
	static Node addBegin(Node nodeParameter, int data)
	{
	    if (nodeParameter == null)
	        return addToEmpty(nodeParameter, data);
	 
	    Node Temporary = new Node();
	 
	    Temporary.data = data;
	    Temporary.node = nodeParameter.node;
	    nodeParameter.node = Temporary;
	 
	    return nodeParameter;
	}
	 
	static Node addLast(Node nodeParameter, int data)
	{
	    if (nodeParameter == null)
	        return addToEmpty(nodeParameter, data);
	     
	    Node Temporary = new Node();
	 
	    Temporary.data = data;
	    Temporary.node = nodeParameter.node;
	    nodeParameter.node = Temporary;
	    nodeParameter = Temporary;
	 
	    return nodeParameter;
	}	 
	static Node addAfter(Node nodeParameter, int data, int item)
	{
	    if (nodeParameter == null)
	        return null;
	 
	    Node Temporary, p;
	    p = nodeParameter.node;
	    do
	    {
	        if (p.data == item)
	        {
	        	Temporary = new Node();
	        	Temporary.data = data;
	        	Temporary.node = p.node;
	            p.node = Temporary;
	 
	            if (p == nodeParameter)
	            	nodeParameter = Temporary;
	            return nodeParameter;
	        }
	        p = p.node;
	    } while(p != nodeParameter.node);
	 
	    System.out.println(item + " not present in the list.");
	    return nodeParameter;	 
	}	 
	static void traverse(Node nodeParameter)
	{
	    Node p;

	    if (nodeParameter == null)
	    {
	        System.out.println("List is empty.");
	        return;
	    }
	 
	    p = nodeParameter.node;
	 
	    do
	    {
	        System.out.print(p.data + " ");
	        p = p.node;
	 
	    }
	    while(p != nodeParameter.node);	 
	}
	public static void main(String[] args)
	{
	    Node nodeParameter = null;
	 
	    nodeParameter = addBegin(nodeParameter, 10);
	    nodeParameter = addLast(nodeParameter, 45);
	    nodeParameter = addBegin(nodeParameter, 88);
	    nodeParameter = addLast(nodeParameter, 34);
	    nodeParameter = addAfter(nodeParameter, 40, 88);
	    nodeParameter = addAfter(nodeParameter, 77, 34);
	 
	    traverse(nodeParameter);
	}
}
