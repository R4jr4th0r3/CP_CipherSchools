import java.util.*;


class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
	}
}

class MyStack{
	Node head;
	int sz;
	MyStack(int x){
		head = null;
		sz = 0;
	}
	int size(){
		return sz;
	}
	boolean isEmpty(){
		return (head == null);
	}
	void push(int x){
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		sz++;
	}

	int pop(){
		if(head == null){return Integer.MAX_VALUE;}
		int res = head.data;
		head = head.next;
		sz--;
		return res;
	}
	int peek(){
		if(head == null){return Integer.MAX_VALUE;}
		return head.data;
	}
}






class StackUsingLinkedList{
	public static void main(String[] args){
		MyStack s = new MyStack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
		System.out.println(s.size());
		s.pop();
		System.out.println(s.isEmpty());
	}
}