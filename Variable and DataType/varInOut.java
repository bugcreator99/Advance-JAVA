import java.io.DataInputStream;
import java.io.IOException;

public class varInOut {
    public static void main(String[] args) {
        char ch;
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter a char: ");
        try {
            ch = (char)System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ch);
    }
}
