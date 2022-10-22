import java.util.Scanner;
public class checkOut {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        boolean goAgain = true;
        double sum = 0.0;
        while(goAgain)
        {
            double nextPrice = SafeInput.getRangedDouble(s, "Enter the price of your item: ", 0.50, 9.99);
            sum = sum + nextPrice;
            goAgain = SafeInput.getYNConfirm(s, "Do you want to add another item to your cart ?");
        }
        System.out.println(String.format("Your total price is " + "%.2f", sum));

    }
}