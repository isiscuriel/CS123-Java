//// Author:Isis Curiel
////Purpose:
////Name:CS123Ass1ID4644

public class CS123Ass1ID4644 
{
  public static void main (String args[]) 
  {
    int monthlyPay = 2555;
    double taxRate = 0.33;
    int expense = 5000;
    double annualPayAfterTax = monthlyPay * (1-taxRate)*12;
    double netIncome=annualPayAfterTax - expense;
    System.out.println(monthlyPay);
    System.out.println(taxRate);
    System.out.println(annualPayAfterTax);
    System.out.println(expense);
    System.out.println(netIncome);
    
  }
}

      