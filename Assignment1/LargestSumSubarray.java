import java.util.*;

class LargestSumSubarray{
	
	static int maxSum(int arr[]){
		int res = arr[0];
		int maxEnd = arr[0];
		for(int i=1;i<arr.length;i++){
			maxEnd = Math.max(maxEnd+arr[i],arr[i]);
			res = Math.max(res,maxEnd);
		}
		return res;
	}


	public static void main(String[] args){
			int[] arr = new int[] {-2,-3,4,-1,-2,1,5,-3};
			System.out.println(maxSum(arr));
	}
}