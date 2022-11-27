import java.util.Scanner;
import java.util.StringTokenizer;

public class ImplementEx01 {
    public static void main(String[] args) {
        int fieldSize;
        Scanner scanner = new Scanner(System.in);

        fieldSize = scanner.nextInt();
        scanner.nextLine();
        String[] guide = scanner.nextLine().split("");

        int x = 1;
        int dx = 0;
        int y = 1;
        int dy= 0;


        for(int i = 0 ; i < guide.length; i++ ){
            if(guide[i].equals("R")){
                dx= 1;
            }
            if(guide[i].equals("L")){
                dx= -1;
            }
            if(guide[i].equals("U")){
                dy= -1;
            }
            if(guide[i].equals("D")){
                dy= 1;
            }
            x= x + dx;
            y= y + dy;

            if (x > fieldSize || y > fieldSize || x < 1 || y < 1){
                x= x - dx;
                y= y - dy;
            }

            dx = 0;
            dy = 0;
        }
        System.out.println(y + " " + x);
    }
    }

