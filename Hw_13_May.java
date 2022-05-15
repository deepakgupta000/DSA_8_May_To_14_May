package com.DSA_8_May_To_14_May;

public class Hw_13_May {

	 static Node head; 
	 class Node
	 {
	     int data;
	     Node next;
	     Node(int d)
	     {
	         data = d;
	         next = null;
	     }
	 }

	 void segregateEvenOdd()
	 {
	     Node end = head;
	     Node prev = null;
	     Node curr = head;

	    
	     while (end.next != null)
	         end = end.next;

	     Node new_end = end;

	     while (curr.data %2 !=0 && curr != end)
	     {
	         new_end.next = curr;
	         curr = curr.next;
	         new_end.next.next = null;
	         new_end = new_end.next;
	     }

	     if (curr.data %2 ==0)
	     {
	         head = curr;

	         while (curr != end)
	         {
	             if (curr.data % 2 == 0)
	             {
	                 prev = curr;
	                 curr = curr.next;
	             }
	             else
	             {
	                 prev.next = curr.next;

	                 curr.next = null;
	                 new_end.next = curr;

	                 new_end = curr;
	                 curr = prev.next;
	             }
	         }
	     }

	     else prev = curr;

	     if (new_end != end && end.data %2 != 0)
	     {
	         prev.next = end.next;
	         end.next = null;
	         new_end.next = end;
	     }
	 }

	 
	 void add(int new_data)
	 {
	     
	     Node new_node = new Node(new_data);

	    
	     new_node.next = head;

	     
	     head = new_node;
	 }

	 
	 void printList()
	 {
	     Node temp = head;
	     while(temp != null)
	     {
	         System.out.print(temp.data+" ");
	         temp = temp.next;
	     }
	     System.out.println();
	 }
	 
	 public  static boolean findCycle(Node head) {
			
			boolean found = false;
			
			
			if(head==null) {
				return found;
			}
			
			if(head.next==null)
			{
				return found;
			}
			
			else {
				
				Node slowP = head;
				Node fastP = head;
				
				while(fastP!=null && fastP.next.next!=null) {
					
					fastP = fastP.next;
					
					if(fastP.next!=null) {
						fastP = fastP.next;
						slowP = slowP.next;
					}
					
					if(slowP == fastP)
					{
						found = true;
						 
						
					}
					
				}
			}
			return found;
		}
		


	 
	 public static void main(String args[])
	 {
	     Hw_13_May llist = new Hw_13_May();
	     llist.add(11);
	     llist.add(10);
	     llist.add(8);
	     llist.add(6);
	     llist.add(4);
	     llist.add(2);
	     llist.add(0);
	     llist.add(3);
	     System.out.println("Original Linked List");
	     llist.printList();

	     llist.segregateEvenOdd();

	     System.out.println("Modified Linked List");
	     llist.printList();
	     
	     System.out.println(llist.findCycle(head));
	 }
}
