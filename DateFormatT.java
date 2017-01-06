import java.util.*;

public class DateFormatT

{

  public static void main(String [ ] args)
  { 


   Scanner inp = new Scanner(System.in);

   System.out.println("Enter the date in mm/dd/yyyy format.");

   String mm;
   String dd;
   String yyyy;
   String dateS = inp.nextLine();
   int mmn = Integer.parseInt(dateS.substring(0, dateS.indexOf("/")));
   int ddn = Integer.parseInt(dateS.substring(dateS.indexOf("/") + 1, dateS.lastIndexOf("/")));
   int yyyyn = Integer.parseInt(dateS.substring(dateS.lastIndexOf("/") + 1));

   boolean isLeapYear;
   isLeapYear = false;
   
   if(((yyyyn%4==0) && (!(yyyyn%100==0))) || ((yyyyn%400==0) && ((yyyyn%100==0))))
    {
    isLeapYear=true;
    }
    System.out.println(dateS);
    if((mmn>12) || (mmn<1))
      {
       System.out.print(":invalid month");
      }

      if((ddn>31 && ddn<1))
      {
       System.out.print(":invalid day");
      }

     if((mmn==2 && (ddn<29)) && isLeapYear==false)
      {
        System.out.print(":invalid day for the month of February.");
      }
      if((mmn==2) && (ddn>29))
      {
       System.out.println(":invalid date");
      }
       if((mmn==2) && (ddn==29) && isLeapYear==false)
      {
       System.out.println(":invalid date since" );
      }
      
        if ((mmn == 11) || (mmn == 9) || (mmn == 6) || (mmn == 4)  &&  (ddn > 30)){
       System.out.println(":invalid date");
      }   
        if (isLeapYear==true){
         System.out.print(yyyyn + " is a leap year");
        }


           
           if((mmn==2 && (ddn==29)) && isLeapYear==true)
            System.out.print(" valid since " + yyyyn + " is a leap year");
           if((mmn==2 && (ddn==29)) && isLeapYear==false)
               System.out.print(yyyyn + " is a not leap year"); 
          
  }
}
   







   