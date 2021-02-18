import java.util.*;

class Node{
		int data;
		Node next;
		Node(int x){
			data = x;
	}
}
class SinglyLinkedList{

	static Node insertBegin(Node head,int x){
		Node temp = new Node(x);
		temp.next = head;
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
		return head;
	}

	static Node removeHead(Node head){
		if(head == null){
			return null;
		}
		else{
			return head.next;
			}
	}

	static Node removeEnd(Node head){
		if(head == null){
			return null;
		}
		if(head.next == null){
			return null;
		}
		Node curr = head;
		while(curr.next.next != null){
			curr = curr.next;
		}
		curr.next = null;
		return head;

	}
	static Node insertPos(Node head,int pos,int x){
		Node temp = new Node(x);
		if(head == null){
			return temp;
		}
		if(pos == 1){
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for(int i=1;i<=pos-2;i++){
			curr = curr.next;}
		
		if(curr == null){
			return head;
		}
			temp.next = curr.next;
			curr.next = temp;
			return head;
	}
	

	public static void main(String[] args){
		Node head = null;
		head = insertBegin(head,10);
		head = insertBegin(head,20);
		head = insertBegin(head,30);
		head = insertBegin(head,40);
		head = insertEnd(head,50);
		head = removeHead(head);
		head = removeEnd(head);
		head = insertPos(head,2,90);
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}