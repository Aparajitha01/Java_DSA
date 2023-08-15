
import java.util.*;
public class LinkedList
{
	private Node head;
	private Node tail;
	public int size;
	public LinkedList(){
		this.size=0;
	}
   //every item knows about the next node
   //head==>first item , tail==> last item >>>point to null
	//cannot directly access the index bcoz node does not have any idea about it ending point
	//it knows only about it's next node
   private class Node{
	   private int value;
	   private Node next;
	  
	   public Node(int value) {
		   this.value=value;
	   }
	   public Node(int value,Node next) {
		   this.value=value;
		   this.next=next;
	   }
   }
   public void insertFirst(int val) {
	   Node node = new Node(val);
	   node.next=head;
	   head = node;
	   if(tail==null) {
		   tail=head;
	   }
	   size+=1; 
   }
   public void display() {
	   Node temp = head;
	   while(temp != null) {
		   System.out.print(temp.value+"-->");
		   temp=temp.next;
	   }
	   System.out.print("End");
   }
   public void insertLast(int val) {
	   if(tail== null) {
		   insertFirst(val);
		   return;
	   }
	   Node node = new Node(val);
	   tail.next=node;
	   tail=node;
	   size++;
   }
   public static void main(String args[]) {
	   LinkedList l=new LinkedList();
	   l.insertFirst(3);
	   l.insertFirst(13);
	   l.insertFirst(53);
	   l.insertFirst(30);
	   l.insertLast(99);
	   l.display();
	   
	   
   }
	
}
    
