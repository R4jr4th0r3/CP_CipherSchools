import java.util.*;

class Node {
	int data;
	Node next;
	Node(int x)
	{
		data = x;
		}
}

class MyStack {
	Node top;
	public void push(int x)
	{
		if (top == null) {
			top = new Node(data);
			return;
		}
		Node s = new Node(data);
		s.next = top;
		top = s;
	}
	public Node pop()
	{
		Node s = top;
		top = top.next;
		return s;
	}

	public void display()
	{
		Node s = top;
		while (s != null) {
			System.out.print(s.data + " ");
			s = s.next;
		}
		System.out.println();
	}

	public void reverse()
	{
		Node prev, cur, succ;
		cur = prev = top;
		cur = cur.next;
		prev.next = null;
		while (cur != null) {

			succ = cur.next;
			cur.next = prev;
			prev = cur;
			cur = succ;
		}
		top = prev;
	}
}

public class ReverseAStack{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.reverse();
		s.display();
	}
}
