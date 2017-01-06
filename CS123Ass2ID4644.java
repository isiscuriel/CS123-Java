import java.util.*;
import java.io.Console;

public class CS123Ass2ID4644
 {
  public static void main (String args[])
  {
    int wholeN,firstD,secondD,thirdD,fourthD;  ///Declare variables
    Scanner myK = new Scanner (System.in); // make scanner
    System.out.println("Enter a four digit number:");  /// prompts user 
    wholeN = myK.nextInt();
    firstD = wholeN % 10;           /// take remainder of number divided by 10
    wholeN = wholeN / 10;           /// integer divide by 10
    secondD = wholeN % 10;          /// does it again 
    wholeN = wholeN / 10;
    thirdD = wholeN % 10;
    wholeN = wholeN / 10;
    fourthD = wholeN % 10;
    wholeN = wholeN / 10;
    
    System.out.println(fourthD);   /// prints 4th digit buts it actually the first 
    System.out.println(thirdD);    /// prints 3rd digit buts it actually the second 
    System.out.println(secondD);   /// prints 2nd digit buts it actually the third 
    System.out.println(firstD);    /// prints 1st digit buts it actually the fourth 
  }
}