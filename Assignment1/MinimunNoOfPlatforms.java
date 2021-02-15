import java.util.*;

class MinimumNoOfPlatforms{
	
	static int requirePlatforms(int arr1[],int arr2[]){
		Arrays.sort(arr1);
		Arrays.sort(arr2);


		int noOfPlatforms = 1;
		int res = 1;
		int i = 1;
		int j = 0;
		while(i < arr1.length && j<arr1.length){
			if(arr1[i] <= arr2[j]){
				noOfPlatforms++;
				i++;
			}
			else if(arr1[i] > arr2[j]){
				noOfPlatforms--;
				j++;
			}
			if(noOfPlatforms > res){
				res = noOfPlatforms;
			}
		}
		return res;

	}



	public static void main(String[] args){
		int arr1[] = new int[] {900, 940, 950, 1100, 1500, 1800};
		int arr2[] = new int[] {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println(requirePlatforms(arr1,arr2));
	}
}