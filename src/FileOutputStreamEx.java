import java.io.*;

public class FileOutputStreamEx extends OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("files\\out.txt");
        FileOutputStream fosTest = new FileOutputStream("files\\test.txt");
        fos.write(new byte[]{'1', '1', '2'}, 0, 3);
        fos.close();
        fosTest.write("GIVE ME THE CODE, PLEASE".getBytes());
        fosTest.write("Привет FileOutputStream мир".getBytes("UTF-8"));
        fosTest.close();

        FileInputStream fis = new FileInputStream("files\\test.txt");
        int c;
        while((c=fis.read())!=-1){
        System.out.print((char)c);
        }fis.close();

    }


    public FileOutputStreamEx(File file) throws FileNotFoundException {

    }

    @Override
    public void write(int b) throws IOException {

    }
}
