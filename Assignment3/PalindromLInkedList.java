import java.util.*;


class Node{
	int data;
	int next;
	Node(int x){
		data = x;
	}
}

class PalindromLinkedList{

	static boolean isPalindrom(Node head){
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		Node rev = reverseList(slow.next);
		Node curr = head;
		while(rev.data != null ){
			if(rev.data != curr.data){
				return false;
			}
			rev = rev.next;
			curr = curr.next;
			return true;
		}


	}

	static Node reverseList(Node head){
	Node curr = head;
	Node prev = null;
	while(curr !=null){
		Node next = curr.next;
		prev = curr;
		curr = next;

	}
	return prev;
}
	
	public static void main(String[] args){

	}
	
}