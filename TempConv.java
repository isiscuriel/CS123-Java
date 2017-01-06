import java.util.*;
public class TempConv_2
{
  public static void main(String[]args)
  {
    
  float n; 
  Scanner myK = new Scanner(System.in);
  System.out.println("Enter a degree");
  n = myK.nextInt();
  System.out.println("Convert from F or C");
  char t = myK.next().charAt(0);
  do 
  {
    
    switch(t) {
    case 'f':
    n = 5*(n-32)/9;
    System.out.println(n+"F");
    break;
    case 'F':
    
     n = 5*(n-32)/9;
     System.out.println(n+"F");   
     break;
    
    case 'C': 
    
     n = ((9*(n)/5)+32);
     System.out.println(n+"F");
     break;
    
     case 'c': 
    
    n = ((9*(n)/5)+32);
    System.out.println(n+"F");
    break;
   case 'q':
     System.exit(0);
     break;
     case 'Q':
      System.exit(0);
     break;
    default:System.out.println("Sorry your input is not valid please try again "); 
   
    
  }
   t = myK.next().charAt(0);  
  } while (t != 'q' || t != 'Q');
  
}
}