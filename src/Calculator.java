import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        Scanner in = new Scanner(new FileInputStream("files/numbers.txt"));
        while (in.hasNext()) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }

}
