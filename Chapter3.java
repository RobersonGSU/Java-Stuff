/**
Roberson Lubin
Date:6/21/2016
Chapter 3
*/

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class Chapter3 
{
   public static void main(String[]args)throws Exception
   {   
   System.out.print("My name is Rob ");
   Date todayDate = new Date();
   System.out.println("and today's date is " + todayDate);
   URL myawpic = new URL("http://s.quickmeme.com/img/59/59eb04119028a5dffd065910ed3808fca8e5915efc65dfcf78680017ef59c8a5.jpg");
   
   JOptionPane.showMessageDialog(null,"R8 ADV1","Audi", JOptionPane.PLAIN_MESSAGE, new ImageIcon(myawpic));
   
   
   
   // What is this ???? System.out.println(128>>>1);  
   
   // Elevator solution for countries that believe 14 is an unlucky number to give correct floor
   
   
   Scanner user = new Scanner(System.in);
   System.out.print(" Floor: ");
    int selectedFloor = user.nextInt(), actualFloor;
    
    if(selectedFloor > 14)
      {
         actualFloor = selectedFloor - 1;
      
      }
      else
      {
         actualFloor = selectedFloor;
      }
   System.out.println(" The elevator will go to floor : " + actualFloor);
   
   // This determines if you get a 10% discount on shipping
   
   System.out.println(" What was your total amount for all the items you bought ?");
   double usersTotalAmount = user.nextDouble();
   
   if(usersTotalAmount > 74)
   {
      System.out.println("You get a 10% discount ");
      double usersDiscountPrice = usersTotalAmount - (.10* usersTotalAmount);
      System.out.println(" Your total is " + usersDiscountPrice);
   }
   else
   {
      System.out.println("Your total cost will be " + usersTotalAmount);
   }
   
   String mine1 = "Amy";
   
   String mine3 = "Somin";
   
   System.out.println(mine1.compareTo(mine3));//lexicographic ordering of strings
   
   /**
   System.out.println("What is your gamertag " );
   String usersNameTag = user.next();
   int credits;
   
   boolean longEnough= false;
   
   if(   usersNameTag.length()>= 3)
   {
     longEnough= true;
   if(usersNameTag.substring(0,3).equals("rob"))
   {
      credits=1000;
   }
   else
   {
      credits=500;
   }
    System.out.println(" You get " + credits +" Credits");
   }
   else
   {
     longEnough==true;
   }
   
   */
   
   
   System.out.println(" Are you married ? " );
   String userRStatus= user.next();
   if(userRStatus.equals("no" ) || userRStatus.equals("NO") ||userRStatus.equals("No") || userRStatus.equals("nO"))
   {
      System.out.println("Are you there");
      String userRes = user.next();
      String respon;
       if(userRes.equals("yes"))
       {
         respon="hi";
       }
       else
       {
         respon=":P";
       }
       
       System.out.println("LREP" + respon);
    }
    else
    {
      System.out.print(":P");
    
    }
    /**
    boolean verify = false;
    
    System.out.println("Enter your name");
    String testIuser= user.next();
    
    if(testIuser.equals("yes"))
    {
    verify = !false;
      
    
    }
    
    */
    
    
    System.out.println("Enter a number");
    double euser= user.nextDouble();
    String sign;
    
    if(euser <0)
    {
      sign=" negative ";
      
    }
    
    else if(euser > 0)
    {
      sign=" positive ";
    }
    else {
    
    sign=" zero ";
    
    }
    
    System.out.println(" Your number is " + sign);
    
   // This program detects if the numbers entered are all the same different and neither
   
   System.out.println("Enter any number for X, Y, Z");
   System.out.print(" X: ");
   double user1nuam = user.nextDouble();
   System.out.println();
   System.out.print(" Y: ");
   double user2nuam = user.nextDouble();
   System.out.println();
    System.out.print(" Z: ");
   double user3nuam = user.nextDouble();
   System.out.println();
   
   if(user1nuam == user2nuam && user2nuam == user1nuam && user2nuam==user3nuam)
   {
      System.out.println("They are all the same");
   }
   
   else
   {
      System.out.println("They are all different");
   }
    
    
   
   
   /**
   ended the 25th What in the world dude!!!!!
   */
   
 System.out.println("floor : " );
 if(user.hasNextInt())
 {
 
   int floor = user.nextInt();
   
   if(floor == 13)
   {
    System.out.println("no floor");
   }
   else if(floor <=0 || floor>20)
   {
     System.out.println("doesnt exist");
   
   }
   else
   {
    actualFloor=floor;
   if(floor>13)
   {
      actualFloor = floor - 1;
   
   }
   
   System.out.println("some flor " + actualFloor);
   }
   }
   else
   {
      System.out.println("error");
   }
    
    double mySumne = 0;
    
     
   
   

    
    
   }
}