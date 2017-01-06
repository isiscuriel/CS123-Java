import java.io.*;
import java.util.Scanner;

public class FirstLast {
public static void main(String[] args) {
    System.out.println("Enter line of text.");
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine(); // Read the whole line instead of word by word
    String[] words = s.split("\\s+"); // Split on any whitespace
       //  ^ remove the first word and following whitespaces 
        s = s.substring(s.indexOf(words[1], words[0].length())) + " " + words[0].toLowerCase();
        // ^   Add the first word to the end
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println("I have rephrased that line to read:");
      
    ///String newString = s.substring(s.indexOf("")+1) + s.substring(0,s.indexOf("")); 
    System.out.println(s);
    }

 
 }
