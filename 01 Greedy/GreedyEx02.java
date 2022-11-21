import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.lang.Math;
import java.time.chrono.MinguoChronology;

public class GreedyEx02 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int m ;
		int n ;
		int max =0 ;
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		int [] min = new int [n];
		int [][] array = new int [n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0 ; j < m ; j++)
			{
				array[i][j] = scanner.nextInt();				
			}
			min[i] = 10001;
		}
		
		long beforeTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0 ; j < m ; j++)
			{
				min[i] = Math.min(min[i], array[i][j]);
				
			}
			max = Math.max(min[i], max);
		}
		System.out.println(max);
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println(secDiffTime);
		
	}
}
