package arrays_exercises;

public class SinglyLListPracticeaAssignment 
{
	class Node2
	{
		int data;
		Node2 next;
		
		public Node2(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public Node2 head = null;
	public Node2 tail = null;
	
	public void addNode2(int data)
	{
		Node2 newNode2 = new Node2(data);
		
		if(head == null)
		{ 
			head = newNode2;
			tail = newNode2;
		}
		else
		{
			tail.next = newNode2;
			tail = newNode2;
		}
	}
	
	public void display()
	{
		Node2 current2 = head;
		
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list; ");
		while(current2 != null)
		{
			System.out.print(current2.data + " ");
			current2 = current2.next;
		}
		System.out.println();
	}
	
	public void remove(int data)
	{
		if(head == null)
		{
			return;
		}
		Node2 temp = head;
			if(data == 0)
			{
				head = temp.next;
				return;
			}
			for (int i = 0; temp != null && i < data - 1; i++)
			{
				temp = temp.next;
				if (temp == null || temp.next == null)
				{
					return;
				}
			}
			Node2 next = temp.next.next;
			temp.next = next;
			System.out.println("Node (index) removed: " + temp.data);
	}
	
	
	public static void main(String[] args) 
	{
		SinglyLListPracticeaAssignment sL = new SinglyLListPracticeaAssignment();
		
		sL.addNode2(1);
		sL.addNode2(2);
		sL.addNode2(3);
		sL.addNode2(4);
		sL.addNode2(5);
		
		sL.display();
		sL.remove(3);
		sL.display();
	}
}
