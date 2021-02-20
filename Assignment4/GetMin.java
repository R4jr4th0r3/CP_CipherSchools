import java.util.*;

class MyStack {
 
    Stack<Integer> mainStack;
    Stack<Integer> auxilaryStack;
    
    MyStack(){
        mainStack = new Stack<>();
        auxilaryStack =new Stack<>();
    }
 
void push(int x) {
 
      if(mainStack.isEmpty() ) {
          mainStack.add(x);auxilaryStack.add(x);return;
      }
      
      mainStack.add(x);
      
      if(auxilaryStack.peek()>=mainStack.peek())
        auxilaryStack.add(x);
   }
 
void pop() {
 
    if(auxilaryStack.peek()==mainStack.peek())
        auxilaryStack.pop();
    mainStack.pop();
    
   }

int top() {
     return mainStack.peek();
   }
 
int getMin() {
      return auxilaryStack.peek();
   }
}

class GetMin{
  
    public static void main(String[] args) 
    { 
        MyStack s=new MyStack();;
        s.push(2);
        s.push(6);
        s.push(7);
        s.push(0);
        s.pop();
     
        System.out.print(s.getMin());
  
    } 
} 
	
