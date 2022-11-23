import java.util.Scanner;
import java.util.Arrays;

public class GreedyEx04 {

	public static void main(String[] args) {
		
		int result = 0;
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		n = scanner.nextInt();
		int[] party = new int[n];
		
		for(int i = 0 ; i < n ;i ++)
		{
			party[i] = scanner.nextInt();
		}
		Arrays.sort(party);
		
		int count = 0;
		
		for (int i = 0; i < n ; i++)
		{
			count = 1 + count;
				if (count >= party[i])
				{
					result++;
					count = 0;
				}
		
		}
		System.out.println(result);
		
	}
}
