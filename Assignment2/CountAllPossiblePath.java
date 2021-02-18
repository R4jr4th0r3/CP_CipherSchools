import java.util.*;

class CountAllPossiblePath{ 

	static int numberOfPaths(int m, int n) 
	{ 

		if (m == 1 || n == 1) {
			return 1; 
		}

		return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1); 
	} 

	public static void main(String args[]) 
	{ 
		System.out.print(numberOfPaths(2, 2)); 
	} 
} 
