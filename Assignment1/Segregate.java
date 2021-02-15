import java.util.*;

class Segregate{
	public static void main(String[] args){
		int[] arr = new int[] {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			if(arr[start] == 1){
				arr[end] = arr[end] + arr[start];
				arr[start] = arr[end] - arr[start];
				arr[end] = arr[end] - arr[start];
				end--;
			}
			else{
				start++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}