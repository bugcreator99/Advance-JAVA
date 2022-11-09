import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WrapperClass {
    public static void main(String[] args) {
        Integer Roll;
        String Name;
        Float Mark;
        String s1,s2;

        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);

        try {
            System.out.print("Roll : ");
            s1 = BR.readLine();
            Roll = Integer.valueOf(s1);
            System.out.print("Name : ");
            Name = BR.readLine();
            System.out.print("Mark : ");
            s2 = BR.readLine();
            Mark = Float.valueOf(s2);
            System.out.println("Roll is: "+Roll);
            System.out.println("Name is: "+Name);
            System.out.println("Marks is: "+Mark);
        }
        catch (Exception e){
            System.out.println("Exception No: "+e);
        }
    }
}
