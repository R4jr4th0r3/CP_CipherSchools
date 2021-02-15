import java.util.*;

class TrappingRainWater{

	static int capacity(int[] arr){
		int res = 0;
		int[] lmax = new int[arr.length];
		int[] rmax = new int[arr.length];
		lmax[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			lmax[i]  = Math.max(arr[i],lmax[i-1]);

		}
		rmax[arr.length-1] = arr[arr.length-1];
		for(int j = arr.length-2;j>=0;j--){
			rmax[j] = Math.max(arr[j],rmax[j+1]);
		}
		for(int i=1;i<arr.length-1;i++){
			res = res + (Math.min(lmax[i],rmax[i])-arr[i]);
			
		}
		return res;
	}


	public static void main(String[] args){
		int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(capacity(arr));
	}
}