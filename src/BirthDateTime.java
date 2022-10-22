import java.util.Scanner;

public class BirthDateTime
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "enter your birth year number", 1950, 2010);
        int birthMonth = SafeInput.getRangedInt(in, "enter your birth month number", 1, 12);
        int birthDay = SafeInput.getRangedInt(in, "enter your birth day number", 1, 32);
        int birthHour = SafeInput.getRangedInt(in, "enter your birth hour number", 0, 24);
        int birthMinute = SafeInput.getRangedInt(in, "enter your birth minute number", 0, 60);

        System.out.println("your birth year is: " + birthYear);
        System.out.println("your birth month is: " + birthMonth);
        System.out.println("your birth day is: " + birthDay);
        System.out.println("your birth hour is: " + birthHour);
        System.out.println("your birth minute is: " + birthMinute);
    }

}
