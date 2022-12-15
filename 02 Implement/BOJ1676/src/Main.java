import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger result = new BigInteger("1");

        int count = 0;
        boolean check = false;
        int n = scanner.nextInt();
        for(int i = 1 ; i < n+1 ; i++) {
            BigInteger integer = new BigInteger(String.valueOf(i));
            result = result.multiply(integer);
        }
        String change = String.valueOf(result);
        for(int i = change.length() -1 ; i > -1 ;i--){

            if(change.charAt(i) == '0') {
                count++;
                check = true;
            }else{
                if(check == true){
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
