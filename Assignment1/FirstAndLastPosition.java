import java.util.*;

class FirstAndLastPosition{
	public static void main(String[] args){
		int[] arr = new int[] {1, 3, 5, 5, 5, 5, 7, 123, 125 };
		int x = 7;
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				if(arr[i-1] != arr[i]){
					System.out.println("First Occurence =" + i);
				}
				if(arr[i+1]!= arr[i]){
					System.out.println("Last Occuerence ="+ i);
				}
			}
		}
	}
}