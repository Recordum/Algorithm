import java.util.Scanner;

public class ImplementEx02 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        for(int i = 0 ; i <= n ; i++){

            for(int j = 0 ; j < 60 ; j++) {


                for (int k = 0; k < 60; k++) {
                    if (i / 10 == 3 || i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
