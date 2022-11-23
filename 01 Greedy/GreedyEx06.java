import java.nio.channels.IllegalChannelGroupException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class GreedyEx06 {
	public static void main(String[] args) {
		String number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.next();
		
		int[] array = new int[number.length()];
		
		for(int i = 0 ; i < number.length(); i++)
		{
			array[i] = number.charAt(i) - '0';
			
		}
		int count = number.length()-1;
		int change = 0;
		int result = 0;
		while(count > 0)
		{
			if (array[count] != array[count-1])
			{
				change ++;
				
			}
			count --;;
		}
		if(change % 2 == 0) {
			
		result = change / 2 ;
		
		}else {
		
		result = (change +1)/2 ;
		}
		System.out.println(result);
	}
}
