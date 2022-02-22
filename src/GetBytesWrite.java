import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetBytesWrite {
    public static void main(String[] args) throws IOException {

        String path = "files/write.txt";
        File f = new File(path);
        if (f.exists() == true) {
            System.out.println("File exists");
        } else System.out.println("File not exist");

        FileOutputStream fos = new FileOutputStream(path);
        fos.write("Превед!".getBytes("UTF-8"));
        fos.close();
        if (f.exists() == true) {
            System.out.println("File created");
            f.delete();
            System.out.println("File deleted");
        } else System.out.println("not created");

        System.out.println("Encoding: " + System.getProperty("file.encoding"));

    }
}
