import java.io.FileOutputStream;
import java.io.IOException;

public class GetBytesWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("files/write.txt");
        fos.write("Превед! Медвед!".getBytes("UTF-8"));
        fos.close();

    }
}
