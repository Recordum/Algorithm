import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class GreedyEx05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> array= new ArrayList<>();
		ArrayList<Integer> arrayIntegers = new ArrayList<>();
		
		
		
		String number = scanner.next();
		
		for(int i = 0 ; i <number.length() ; i++)
		{
			array.add(number.charAt(i));
			arrayIntegers.add(array.get(i)-'0');
			
		}
		long result = 0;
		
		for(int i = 0 ; i <number.length() ; i++)
		{
			if ( arrayIntegers.get(i) == 0 || arrayIntegers.get(i) == 1 || result == 0){
				result = result + arrayIntegers.get(i);
			
			}else {
				 	result = result * arrayIntegers.get(i);
				
			}	
			
		}
		
		System.out.println(result);
		
	}
}
