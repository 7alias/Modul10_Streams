import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Robot {


    public static void main(String[] args) throws IOException {
        Solution robot = new Solution();
        System.out.println(robot.translate());
    }
    public static class Solution {
        public String translate() throws IOException {
            String sum = "";

            FileInputStream fis = new FileInputStream("files/message.txt");

            System.out.println(fis.read());


            //int c;
            //while((c=fis.read())!=-1){
                //System.out.print((char)c);

            /*switch (){
                case 'A': sum+="1000001";
                break;
                case 'B': sum+="1000010";
                break;
                default:sum="";

            }
            */

            //}
            fis.close();
            /*
            1000001            A
            1000010            B
            1000011            C
            1000100            D
            1000101            E
            1000110            F
            1000111            G
            1001000            H
            1001001            I
            1001010            J
            1001011            K
            1001100            L
            1001101            M
            1001110            N
            1001111            O
            1010000            P
            1010001            Q
            1010010            R
            1010011            S
            1010100            T
            1010101            U
            1010110            V
            1010111            W
            1011000            X
            1011001            Y
            1011010            Z

             */
return sum;
        }
    }
}
