import java.util.Scanner;

public class Reggie
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in,"Enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SNN: "+ ssn);

        String mN = SafeInput.getRegExString(in,"Enter your M Number","(M|m)\\d{5}");
        System.out.println("Your M Number: "+ mN);

        String oSVQ = SafeInput.getRegExString(in,"Enter a menu choice","[OoSsVvQq]");
        System.out.println("Your choice is: "+ oSVQ);

    }

}