import java.util.*;

class TwoPeoples{
	static void swap(int x, int y){
		int temp = x;
		x = y;
		y = temp;
	}

	static boolean meet(int x1,int x2,int v1,int v2){
		if(x1 > x2 && v1 > v2){
			return false;
		}
		if(x2 > x1 && v2 > v1)
		{
			return false;
		}
		if(x1<x2){
			swap(x1,x2);
			swap(v1,v2);

		}
		while(x1>=x2){
			if(x1 == x2){
				return true;
			}
			x1 = x1 + v1;
			x2 = x2 + v2;
		}
		return false;

	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		if(meet(x1,x2,v1,v2)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
