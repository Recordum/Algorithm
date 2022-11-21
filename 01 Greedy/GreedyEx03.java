import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class GreedyEx03 {
	public static void main(String[] args) {
		
		int n;
		int k;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		long beforeTime = System.currentTimeMillis();
		while(n != 1)
		{
			if(n%k == 0) {
				n = n / k;
				result++;
			}else {
				n = n - 1;
				result++;
					
			}
		}
		System.out.println(result);
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println(secDiffTime);
		
	}
}
