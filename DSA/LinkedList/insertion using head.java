import java.util.*;
public class LinkedList1 {
	Node head;
	class Node{
		 int data;
		 Node next;
		 Node(int val){
			 data=val;
			 next=null;
		 }
	 }
	LinkedList1(){
		head=null;
	}
	public void  insertAtbegining(int val){
		Node newNode = new Node(val);
		if(head==null) {
			head =newNode; 
		}
		else {
			newNode.next=head;
			head=newNode;		
			}
	}
public void display() {
   Node temp = head;
  while(temp!=null) {
		System.out.print(temp.data+" ");
		temp = temp.next;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList1 li = new LinkedList1();
           li.insertAtbegining(1);
           li.insertAtbegining(2);
           li.insertAtbegining(3);
           li.display();
	
	}
	

}
 
