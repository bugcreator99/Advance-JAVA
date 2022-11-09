import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intFloat {
    public static void main(String[] args) throws IOException {
        int roll;
        float mark;
        String S1,S2;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.print("Enter Roll: ");
        S1 = BR.readLine();
        roll = Integer.parseInt(S1);
        System.out.print("Enter Marks: ");
        S2 = BR.readLine();
        mark = Float.parseFloat(S2);
        System.out.println();
        System.out.println("Roll Entered: "+roll);
        System.out.println("Marks Entered: "+mark);
    }
}
