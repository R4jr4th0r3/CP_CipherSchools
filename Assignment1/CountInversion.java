import java.util.*;

class CountInversion{

	 static int countInversion(int[] arr)
    {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    count++;
 
        return count;
    }
   	public static void main(String[] args){
		
    int arr[] = new int[] {8, 4, 2, 1};
 	System.out.println(countInversion(arr));
	}
}