import java.util.*;
 
class SortStack
{

    static void sortedInsert(Stack<Integer> s, int x)
    {
        if (s.isEmpty() || x > s.peek()) 
        {
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
 
        s.push(temp);
    }
 

    static void sortStack(Stack<Integer> s)
    {

        if (!s.isEmpty()) 
        {
    
            int x = s.pop();
 
 
            sortStack(s);

            sortedInsert(s, x);
        }
    }
 
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        while (lt.hasNext())
            lt.next();
 
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(5);
        s.push(-2);
        s.push(8);
        s.push(-6);
        sortStack(s);
        printStack(s);
    }
}