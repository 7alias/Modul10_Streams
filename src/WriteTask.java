import java.io.*;

public class WriteTask{

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("files\\request.txt");


        fos.write("GIVE ME THE CODE, PLEASE".getBytes());

        fos.close();

        FileInputStream fis = new FileInputStream("files\\request.txt");
        int c;
        while ((c = fis.read()) != -1) {
            System.out.print((char) c);
        }
        fis.close();

    }

}
