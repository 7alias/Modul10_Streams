import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyFileUsingStream("files/photo.jpg","files/dest.jpg");
    }
    private static void copyFileUsingStream(String source, String dest) throws IOException {
        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}