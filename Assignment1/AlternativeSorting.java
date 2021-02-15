import java.util.*;

class AlternativeSorting{
	static void alternativeSorting(int arr[]){
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			System.out.print(arr[end]+" ");
			System.out.print(arr[start]+" ");
			end--;
			start++;
		}
		if(arr.length%2 !=0){
			System.out.print(arr[start]);
		}
	}

	public static void main(String[] args){
		int[] arr = new int[] {7, 1, 2, 3, 4, 5, 6};
		alternativeSorting(arr);	
	}
}