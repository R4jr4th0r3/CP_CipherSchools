import java.util.*;

class PossibleDecoding{

	static int countDecoding(char[] numbers, int n)
	{
		if (n == 0 || n == 1){
			return 1;
		}

		if (numbers[0] == '0'){
			return 0;
		}
		int count = 0;

		if (numbers[n - 1] > '0'){
			count = countDecoding(numbers, n - 1);
		}

		if (numbers[n - 2] == '1' || (numbers[n - 2] == '2' && numbers[n - 1] < '7')){
			count += countDecoding(numbers, n - 2);
		}

		return count;
	}

	static int countWays(char[] numbers, int n)
	{
		if (n == 0 || (n == 1 && numbers[0] == '0')){
			return 0;
		}
		return countDecoding(numbers, n);
	}


	public static void main(String[] args)
	{
		char numbers[] = { '1', '2', '1' };
		int n = numbers.length;
		System.out.print(countWays(numbers, n));
	}
}

