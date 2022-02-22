import java.io.*;
import java.nio.charset.Charset;

public class EncodeFile {

    public static void main(String[] args) throws IOException {
        copyFileUsingStream("src/utf8.txt", "UTF-8", "files/win1251.txt", "windows-1251");
    }

    private static void copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) throws IOException {
        Charset sEnc = Charset.forName(sourceEnc);
        Charset dEnc = Charset.forName(destEnc);

        Reader fis = new InputStreamReader(new FileInputStream(source), sEnc);
        Writer fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        char[] buffer = new char[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}



