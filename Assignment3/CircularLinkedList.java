import java.util.*;

class Node{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data = x;
	}
}

class CircularLinkedList{
	
	static Node insertBegin(Node head,int x){
		Node temp = new Node(x);
		if(head == null){
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
		else{
		temp.prev = head.prev;
		temp.next = head;
		head.prev.next = temp;
		head.prev = temp;
		return temp;
	}
	}

	public static void main(String[] args){

		Node head = new Node(10);
		head.next = head;
		head.prev = head;
		head = insertBegin(head,20);
		head = insertBegin(head,30);
		head = insertBegin(head,40);
		Node curr = head;
		while(curr != head){
			System.out.print(curr.data+" ");
		}

	}
}
