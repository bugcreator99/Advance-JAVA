import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readString {
    public static void main(String[] args) throws IOException {
        String s;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.println("Enter a String: ");
        s = BR.readLine();
        System.out.println("You have entered: "+s);
    }
}
