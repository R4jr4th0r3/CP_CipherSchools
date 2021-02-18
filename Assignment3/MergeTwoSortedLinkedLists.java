import java.util.*;

class Node{
	int data;
	Node next;
	Node(int x){
		data x;
	}
}

class MergeTwoSortedLinkedLists{
	
	static Node mergeSortedLinkedLists(Node head1,Node head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		Node head;
		Node tail;
		if(head1.data<head2.data){
			head = tail = head1;
			head1 = head1.next;
		}
		else{
			head = tail = head2;
			head2 = head2.next;
		}
		while(head1 != null && head2 != null){
			if(head1.data<head2.data){
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			}
			else{
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
		}
		if(head1==null){
			tail.next = head2;
		}
		else{
			tail.next = head1;
		}
		return head;
	}
	public static void main(String[] args){

	}
}