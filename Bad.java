import java.util.*;
import java.io.Console;

public class Bad {

public static void main(String[] args) {
  Console console = System.console();
  LinkedList<Integer> stack = new LinkedList<Integer>();
  int digits = 0;

  do {
  String response = console.readLine("Enter a four digit integer:");
   try{
    digits = Integer.parseInt(response);
   }
    catch (NumberFormatException e){  
    }
    if (1000 > digits || digits > 9999){
      System.out.println("Please try again...");
    }
  }
  while(1000 > digits || digits > 9999);

  while (digits > 0) {
    stack.push( digits % 10 );
    digits = digits / 10;
  }

  while (!stack.isEmpty()) {
    System.out.println(stack.pop());
  }
}
}