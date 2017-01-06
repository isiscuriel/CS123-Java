import java.util.*;

public class YourIncome
{
    public static void main(String[] args)
    {
        int monthlyPay, expense, annualPay, netIncome;
        // read monthlyPay and expense  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your monthly pay:");
        monthlyPay = keyboard.nextInt( );
        System.out.println("Enter your annual expense :");
        expense = keyboard.nextInt( );

        annualPay = monthlyPay * 12;
  netIncome = annualPay - expense;

  System.out.println("If your monthly pay is $ " + monthlyPay);
  System.out.println("and your annual expense is $ " + expense);
  System.out.println("Your annual pay is $ " + annualPay);
  System.out.println("Your net income  is $ " + netIncome);

     }
}