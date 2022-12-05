public class 계수정렬 {
    public static void main(String[] args) {
        int[] array = {5,3,2,2,0,1,0,4};
        int maxValue =  9;
        int[] count = new int[maxValue + 1];

        for(int i = 0; i < array.length ; i++){
            count[array[i]] ++;
        }
        for(int i = 0; i< maxValue;i++){
            for(int j =0; j<count[i];j++){
                System.out.println(i + " ");
            }
        }
    }
}
