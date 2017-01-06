import java.util.*;

public class Ass3ID4644 {
 
 public static void main(String[] args)
 {
  //declare variables
 
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter a sentence without punctuation:");
  String s = scan.nextLine();
  
  //manipulate the string
  s = s.trim();
  String first = s.substring(0, s.indexOf(" "));
  String last = s.substring(s.lastIndexOf(" ") + 1);
  last = last.substring(0,1).toUpperCase() + last.substring(1);
  String newS = last + sentence.substring(s.indexOf(" "), s.lastIndexOf(" ") + 1) + first;
  
  //print the new String
  System.out.println(newS);
  
   
  
 }

}