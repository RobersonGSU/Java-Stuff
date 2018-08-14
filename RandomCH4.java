import java.util.*;
import java.io.*;
import javax.swing.*;

public class RandomCH4{
   public static void main(String[]args){
      Date todaysDate = new Date();
      System.out.println("Program by:Robby :/ \n" + "Todays date is " + todaysDate);
      JOptionPane.showMessageDialog(null, "This program will compute how long it will take to triple your investment at an interest of 15 percent");
      Scanner in = new Scanner(System.in);
      System.out.println("What is your current balance ");
      double balance = in.nextDouble();
      final double triple = balance * 2; //to triple at 5 percent is 23 years to double at 10 percent is 8 years
      final double interest = .10;
      double total = balance;
      System.out.println(total);
      int year = 0;
      while(total < triple)
      {
      
         year++;
         total += (interest * total);
         System.out.println("After year " + year + " balance is " + total);
      }
      System.out.println(year);
   
      int n = 1;
      while (n < 100)
      {
         n = 2 * n;
         System.out.print(n + " ");
      }
      
      System.out.println("This will compute your balance after 5 years ");
      System.out.println("What is your current balance ");
      double currentTotal = in.nextDouble();
      double intereseet = .05;
      
      for(int k = 0; k<10; k++)
      {
         currentTotal+= (currentTotal * intereseet);
         System.out.println(currentTotal);
      }  
      
      int count=0;
      int e=10;
      while(e >=0)
      {
         count++;
         System.out.println(e);
         e--;
      }
      System.out.println(count);
   
      int numbas = 10;
      while(numbas < 20)
      {
         if(numbas%2==0)
         {
            System.out.print(numbas);
         }
      
         numbas++;
      }
   
      double uras;
   
      do
      {
         System.out.println(" Input a number between 0 and 100 ");
         uras = in.nextDouble();
      }while((uras > 100) || (uras < 0));
 
     //double again;
     //boolean bol = false;
     
       double again=0;
    
     boolean dang = false;
     
      while(!dang)
      {
      System.out.println("Input a number between 0 and 100");
          
         again = in.nextDouble();
         if(again > 0 || again < 100)
         {
            dang = true;
             
         }
         else
         {
         dang = false;
       System.out.println(again);
         }
      } 
      
      System.out.println(again);
    
      
      /*
      
      System.out.println("Enter numbers seperated by spaces ");
      int itSp = 0;
      while(in.hasNextInt())
      {
        itSp = in.nextInt();
        if( itSp > 0)
        {
         itSp = itSp + itSp;
         
         }
        
       }
       
       System.out.println(itSp);
       
       */
       
       /*
       
       int spacel = 0;
       String la = "lock rock tock";
       for(int i=0; i<la.length();i++)
       {
         char character = la.charAt(i);
         if(character == 'o')
         {
            spacel++;
         }
       }
       System.out.println(spacel);
       
       int shortt = 0;
       String word;
       System.out.println("Enter a words ");
       while(in.hasNext())
       {
        word = in.next();
         if(word.length() < 10)
         {
            shortt++;
         }
        
       }
       
       System.out.println(shortt);
       */
       
  for(int io=0; io<10;io++)
  {
   for(int lo=0; lo<5;lo++)
   {
     System.out.print("*");   
   }
     System.out.print("*"); 
       System.out.println();
   }
   
   for(int ilu =0; ilu < 3;ilu++)
   {
     for(int liu=0; liu<4;liu++)
     {
      System.out.print("[]");
     }
     System.out.println();
   }  
   
   ArrayList<Integer> mine = new ArrayList<Integer>();
   
   mine.add(1);
   mine.add(2);
   
   
   int mpword = mine.get(0);
   
   System.out.println("The first letter is " + mpword);
   
   
    

    
    
   }
}