/**
Chapter 4
6/25/2017
*/

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class Chapter4
{
   public enum Filingting { SINGLE , MARRIED }  // learn how to use enums
   
   public static void main(String[]args) throws Exception
   {
      System.out.println(" Rober lub ");
      Date now = new Date();
      System.out.println("Todays date is " + now);
      
         
      System.out.println("hi\n what\n"); 
      
      // Compute how many year will it take to get to 30000 dollars with interest rate of 5 percent initial investment 10000
      
      double balance = 10000;
      final double INTERESTRATE = .05;
      int year =0;
      while(balance < 30000)
      {
            year++;
       
         balance = (balance * INTERESTRATE ) + balance;
         
      

      
      }
      
      System.out.println(" It will take " + year + " years to get to 30000 ");
      
      Scanner in = new Scanner(System.in);
      
      
   
  URL imagesM = new URL("http://i.quoteaddicts.com/media/quotes/4/157466-in-software-testing-debugging.jpg");
  
  JOptionPane.showMessageDialog(null, "Yes" , " BLA " , JOptionPane.PLAIN_MESSAGE , new ImageIcon(imagesM));  
  
   int n =1;
     int l=0;
   while(n<100)
   {
      n= 2 * n;
      System.out.println(n + " ");
      l++;
   }
   System.out.println(l);
   
   // thought it would stop at 64 but it goes to 128
   
   /*
   fix
   System.out.println("Enter numbers ");
   int userNeams = in.nextInt() ;
   while( in.hasNextInt()){
   userNeams = in.hasNextInt();
   if(userNeams !=-1)
   {
   System.out.print(userNeams + userNeams);
   }
   }
   
   */ 
   int balanceR = 500;
   int endingBalance = 0;
   for(int i=0; i<30; i++)
   {
      endingBalance= endingBalance + balanceR;
   }
   JOptionPane.showMessageDialog(null, " Your total balance will be " + endingBalance );
   
   int balance12Month = endingBalance * 12;
   
   System.out.println("total year income " + balance12Month);
   
   int counterLel = 0;
   for(int i = 10; i >= 0; i--)
   {
   
      
      System.out.println(i);
       counterLel++;
       
   }
   System.out.println("There are " + counterLel + " Numbers "); // my guess is 11 numbers... need to figure why it stop at zero than negative 1
   
   int lel = 10;
   int didCo=0;
   while(lel >=0)
   {
    System.out.println(lel);
    lel--;
    didCo++;
   }
   System.out.println("prnt num " + didCo);
   
   for(int en = 10; en<=20; en++)
   {
      if(en%2==0)
      {
         System.out.println(en + "is even");
      }
      else
      {
         System.out.print(en + " is not even " + " ");
      }
   
   }
   
   double nMames;
   do
   {
      System.out.println(" Enter a number between 0 and 1000 ");
       nMames = in.nextDouble();
      
   }
   while(nMames > 1000);
   
   System.out.println("Your number is " + nMames);
   
   System.out.println("Enter Number between 0 and 2000");
   nMames = in.nextDouble();
   while(nMames >2000)
   {
      if(nMames > 2000)
      {
         System.out.println("Enter Number between 0 and 2000");
         nMames = in.nextDouble();
      
      }
   
   }
   
   System.out.println("Number is " + nMames);
   
   // This computes the sum of the numbers a user puts in untill it reads zero
   System.out.println("Enter numbers you want to add and end it with a zero ");
   double userDames;
   double total = 0;
   do
   {
      userDames = in.nextDouble();
      
      total= total+ userDames;
      
     }
     
  while(userDames !=0);   
  
  System.out.println("Your total is " + total);
  
      
     double theTotal =0;
     System.out.println("Enter your monthly paycheck from jan - dec");
     double salary = 0;
     while(salary !=-1)
     {
       salary= in.nextDouble();
     if(salary !=-1)
     {
      theTotal = theTotal + salary;
     }
     else
     {
     System.out.println(" no data");
     }
     
     }   
     
     System.out.println("Your total income this year is " + theTotal);
     
   
     
  
     /*
     System.out.println("We will total all the numbers you put in ");
   
   double mySumne = 0;
    
   while (in.hasNextDouble())
   {
       inputUser = in.nextDouble();
     double mySumne = mySumne + inputUser;
   }
   
   System.out.println("your sum is " + mySumne);
 
   */    
   
  
   /**
   
    String str = "My Fair Lady";
    int spaces =0;
    for(int i =0; i<str.length(); i++)
    {
    
      char ch = str.charAt(i);
      if (ch == " ")
      {
       spaces++;
      }
    }
    
    */
     System.out.println("Enter some text");
     in.useDelimiter("send it"); // using delimiter here
      
     System.out.println("You typed" + in.next());
     
     
     System.out.println("TYPE SOMETHING >:/");
     String typeSome = in.nextLine();
     
     System.out.println(" you type dis " + typeSome);
     
     
 // come back and use hasnextint method and leaarn it from simplycoded on youtube also come back and do all the things in the project csc1301
  // also start back atpage 165 
   
   
   }   
}

//1:58  namea car the lenny machine