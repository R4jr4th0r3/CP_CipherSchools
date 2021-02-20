import java.util.*;

class MyStack{
	int arr[];
	int cap;
	int top;
	MyStack(int x){
		top = -1;
		cap = x;
		arr = new int[cap];
	}

void push(int x){
	top++;
	arr[top] = x;
}

int pop(){
	int res = arr[top];
	top--;
	return res;
}

int size(){
	return top+1;
}

boolean isEmpty(){
	return (top == -1);
}
}

class StackUsingArray{
public static void main(String[] args){

	MyStack s = new MyStack(5);
	s.push(10);
	s.push(20);
	s.pop();
	s.push(30);
	System.out.println(s.size());
	System.out.println(s.isEmpty());

}
}