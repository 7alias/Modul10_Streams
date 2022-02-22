import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {
    private static int num;

    public static void main(String[] args) throws IOException {
/*
       String fileName = "src//files//answer.txt";
       FileInputStream fis = new FileInputStream(fileName);
              int i;
             while ((i = fis.read()) != -1) {
                          System.out.print((char) i);
        }
               fis.close();
             System.out.println();

*/


        num = num++;
        System.out.println(num);

        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);


        FileInputStream fin = new FileInputStream("files//answer.txt");

        int c;
        while ((c = fin.read()) != -1) {
            int b = 0;
            b = b + ((int) (c));
        }
        fin.close();


    }
}
