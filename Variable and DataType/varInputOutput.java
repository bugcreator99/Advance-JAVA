import java.io.DataInputStream;

public class varInputOutput {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        char ch;
        try{
            System.out.print("Enter a char: ");
            ch = (char) System.in.read();
            System.out.println("You have entered: "+ch);
        }catch (Exception e){}
    }
}