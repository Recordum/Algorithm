import java.util.Scanner;
public class GreedyEx07{
    public static void main(String[] args) {

        int n ;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        int [] array = new int [n];

        for( int i = 0 ; i < n ; i++)
        {
            array[i] = scanner.nextInt();
        }

        int result = 1;

        for(int i = 0; i<n ; i++)
        {
            if(result < array[i])
                break;
            result = result + array[i] ;

        }
        System.out.println(result);
    }
}
