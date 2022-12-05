public class test {
    public void change(int[] x){
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }
    public static void main(String[] args) {
        int[] array = {5,4};
        test test = new test();
        test.change(array);
        Change ch = new Change();
        ch.c(array);
        System.out.println(array[0]);

    }
}
class Change{

    public Change() {}

    public void c(int[] x){
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }
}
