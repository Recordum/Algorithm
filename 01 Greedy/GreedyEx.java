import java.util.*;
import java.math.*;
public class GreedyEx {
	
public static void main(String[] args) {
	
	int n, m, k;
	double result =0;
	long beforeTime = 0;
	long afterTime = 0;
	Scanner scanner = new Scanner(System.in);
	
	n = scanner.nextInt();
	m = scanner.nextInt();
	k = scanner.nextInt();
	int[] array = new int[n];
		
	for(int i = 0; i < n; i++)
	{
		array[i] = scanner.nextInt();
	}
	beforeTime = System.currentTimeMillis();
	Arrays.sort(array);
	int first = array[n-1];
	int second = array[n-2];
	while(true)
	{
		for( int j = 0; j< k; j++)
		{if(m==0) {
			break;}
			result += first;
			m-=1;
			
		}
		if(m == 0) {
			break;}
		result += second;
		m-=1;
		
	}
	System.out.println(result);
	afterTime = System.currentTimeMillis();
	long secDiffTime = (afterTime - beforeTime)/1000;
	System.out.println(secDiffTime);
}

}

	
	
	
	
	
	