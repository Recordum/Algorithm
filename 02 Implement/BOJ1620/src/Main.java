import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> pokeName = new HashMap<>();
        HashMap<String,Integer> pokeIndex = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] ans;

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        ans = new String[m];

        for(int i = 1; i < n+1  ; i++){
            String name = scanner.nextLine();
            pokeName.put(i,name);
            pokeIndex.put(name,i);
        }

        for(int i = 0; i <m ; i++){
            String input = scanner.nextLine();
            try {
                ans[i] = pokeName.get(Integer.parseInt(input));
            }catch (NumberFormatException e){
                ans[i] = String.valueOf(pokeIndex.get(input));
            }

        }

        /*for(int i = 0; i < m ; i++){
            String input = scanner.nextLine();
            int check = poke.indexOf(input);
            if(check == -1){
               ans[i] = poke.get(Integer.parseInt(input));
            }else{
                ans[i] = String.valueOf(check);
            }
        }*/

        for(int i = 0; i < m ; i++){
            System.out.println(ans[i]);
        }




    }
}
