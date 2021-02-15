import java.util.*;

class SearchSortedMatrix{
 
    static void searchInMatrix(int[][] matrix, int n, int x)
    { 
      int i = 0, j = n - 1;    
        while (i < n && j >= 0) 
        {
            if (matrix[i][j] == x) 
            {
                System.out.print("Found at"+ "(" + i+ ", " + j + ")");
                return;
            }
            if (matrix[i][j] > x){
                j--;
            }
            else{
                i++;
            }
        }
 
        System.out.print("Element not found");
        return;
    }
    public static void main(String[] args)
    {
        int matrix[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
 
        searchInMatrix(matrix, 4, 29);
    }
}