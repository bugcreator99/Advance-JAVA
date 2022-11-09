import java.io.DataInputStream;

public class ReadChar {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        char ch;
        try {
            System.out.print("Enter a Char: ");
            ch = (char) System.in.read();
            System.out.println(ch);
        }
        catch (Exception e){}
    }
}
