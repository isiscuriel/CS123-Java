import java.util.*;

public class sayHello
{
  public static void main (String[] args)
  {
    
     String name = "";
     String hobby = "";
     Scanner keyboard = new Scanner (System.in);
     System.out.println("Input name:");
     name = keyboard.nextLine();
     System.out.println("Input hobby:");
     hobby = keyboard.nextLine();   
     System.out.println(name + " likes to " + hobby);
     
     }
  }