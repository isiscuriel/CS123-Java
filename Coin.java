//********************************************************************
// Assignment 7 
// Represents a coin with two sides that can be flipped.
//  The lines 23, 25, 34 (ending with // @@ )  should be removed 
//   if you use line 33 (ending with // ####)


/*
Homework Static methods & static variables

(1) download and compile Coin.java, study it, compile it.

(2) Run the program and answer the following questions:

    a. what is the output

If I flip my coin 100 times, I get 47 heads. 
If I flip 100 coins, I get 50 heads. 

    b. how many Coin objects are created in main?
    
    101 or 100 coins or 1 

    c. what is the seed value of Coin after each object is created?
    
        a random value 

    d. run the program 5 times, you will see the same output again and again. Explain why.
             
             
             because the face value is a constant 
             
    e. Study the method Math.random()
       and the two constructors of Random, Randon() and Random(seed)
       
       modify the programm so that the output is different every time you run the program.

(3) submit the modified java file, 
    include the answers to a, b, c, d at the beginning of the java file




*/
//********************************************************************


import java.util.*;

public class Coin
{
  private final int HEADS = 0;
  private final int TAILS = 1;
  
  private int face;
  private static int seed =0;
  private Random r; // @@ 
  
  //-----------------------------------------------------------------
  //  Sets up the coin by flipping it initially.
  //-----------------------------------------------------------------
  public Coin ()
  {
    
    flip();
   
  }
  
  //-----------------------------------------------------------------
  //  Flips the coin by randomly choosing a face value.
  //-----------------------------------------------------------------
  public void flip ()
  {
   face = (int) (Math.random() * 2 );    
  }
  
  //-----------------------------------------------------------------
  //  Accessor
  //-----------------------------------------------------------------
  public int getFace()
  {
    return face;
  }
  
  //-----------------------------------------------------------------
  //  Mutator
  //-----------------------------------------------------------------
  public void setFace(int newFace)
  {
    face = newFace;
  }
  
  //-----------------------------------------------------------------
  //  Returns true if the current face of the coin is heads.
  //-----------------------------------------------------------------
  public boolean isHeads ()
  {
    return (face == HEADS);
  }
  
  //-----------------------------------------------------------------
  //  Returns the current face of the coin as a string.
  //-----------------------------------------------------------------
  public String toString()
  {
    String faceName;
    
    if (face == HEADS)
      faceName = "Heads";
    else
      faceName = "Tails";
    
    return faceName;
  }
  
  public static void main(String[] args)
  {
    Coin myCoin = new Coin();
    int headCount=0;
    for (int i =1; i<=100; i++)
    { 
      myCoin.flip();
      if(myCoin.isHeads())
      {
        headCount++;
      }
    }
    
    System.out.println("If I flip my coin 100 times, I get " + headCount + " heads.");
    
    headCount =0;
    for (int i =1; i<=100; i++)
    { 
      
      Coin yourCoin = new Coin();
      yourCoin.flip();
      if(yourCoin.isHeads())
      {
        headCount++;
      }
    }
    
    System.out.println("If I flip 100 coins, I get " + headCount + " heads.");
    
  }
}




