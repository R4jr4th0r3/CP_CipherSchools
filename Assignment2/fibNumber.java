import java.util.*;





class fibNumber
{
    static int fibonnaci(int n)
    {
            if (n <= 1){
    return n;}
    return fibonnaci(n-1) + fibonnaci(n-2);
    }
 
    public static void main (String args[])
    {
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonnaci(n));
    }
}