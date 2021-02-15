import java.util.*;

class StockBuyAndSell{
	

	public static void main(String[] args){
		int[] arr = new int[] {100,180,260,310,40,535,695};
		int profit = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[i-1]){
				profit = profit + arr[i] - arr[i-1];

			}
		}
		System.out.println(profit);
	}
}