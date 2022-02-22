import java.util.Arrays;

public class MassiveSort {

    public static void main(String[] args) {
        int num_arr[] = {1, 7, 6, 4, 8, 2, 1, 9, 10, 5};
        int a = num_arr.length;
        Arrays.sort(num_arr);

        for (int i = 0; i > num_arr.length / 2; i++) {
            int temp = num_arr[i];
            num_arr[i] = num_arr[num_arr.length - i - 1];
            num_arr[num_arr.length - i - 1] = temp;
        }
        for (int i : num_arr) {


            System.out.print(num_arr[i - 1] + " ");
        }
    }
}
