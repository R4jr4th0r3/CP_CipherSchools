import java.util.*;

class Node{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data = x;
	}
}
class DoublyLinkedList{

	static Node insertBegin(Node head,int x){
		Node temp = new Node(x);
		temp.next = head;
		if(head != null){
		head.prev = temp;}
		return temp;

	}

	static Node insertEnd(Node head,int x){
		Node temp = new Node(x);
		if(head == null){
			return temp;
		}
		Node curr = head;
		while(curr.next!=null){
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}

	static Node removeHead(Node head){
		if(head == null){
			return null;
		}
		if(head.next == null){
			return null;
		}
		else{
		head = head.next;
		head.prev = null;
		return head;}
	}

	static Node removeEnd(Node head){
		if(head == null){
			return null;
		}
		if(head.next == null){
			return null;
		}
		Node curr = head;
		while(curr.next.next!=null){
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
	public static void main(String[] args){
		Node head = new Node(10);
		head = insertBegin(head,20);
		head = insertEnd(head,30);
		head = removeHead(head);
		head = removeEnd(head);		
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}