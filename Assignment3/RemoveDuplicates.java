import java.util.*;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
	}
}

class RemoveDuplicates{
	
	static void removeDuplicates(Node head){
		Node curr = head;
		while(curr!=null && curr.next!=null){
			if(curr.data == curr.next.data){
				curr.next = curr.next.next;
			}
			else{
				curr = curr.next;
			}
		}
	}

	public static void main(String[] args){

	}
}