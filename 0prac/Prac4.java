/*
June 7 

*/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;
import java.math.*;

public class Prac4{

   public static void main(String[]args){
   System.out.println(Math.ceil(2 ));   //INTERESTING!!!!!
   Scanner in = new Scanner(System.in);
   
   String sum ="";
   int number =0;
   int total =0;
   System.out.println("Enter numbers to add and end it with .");
   while (!(sum.equals("."))){
   
   sum = in.next();
   if(!(sum.equals("."))){
     number = Integer.parseInt(sum);
      total +=number;
   }
   
   }  
   System.out.println("The sum is  " + total);
   
   System.out.println("Enter a number between 3 and 9 ");
   int n = in.nextInt();
   
   do{
          if(n <= 3 || n >=9){
             System.out.println("Enter a number between 3 and 9 ");
             n = in.nextInt();

          }
      }while(n <= 3 || n >=9);
      
      System.out.println("Number is " + n);
   
   System.out.println("Enter numbers and enter a non integer to end ");
      double largest = 0;
      
      while(in.hasNextDouble()){
         
            double input = in.nextDouble();
            if(input > largest){
               largest = input;
            
            }
      
      }
   
      System.out.println("The largest is " + largest);
      int i =0;
      int ra =0;
      while(i < 5){
      ra = (int)( Math.random()*10) +1;
      System.out.println(ra);
      i ++;
      }
      
      Random random = new Random();
      while(i < 12){
      int da = random.nextInt(100);
      i+=1;
      System.out.println("number : " + da);
 
 /*USING ENUM COLORS*/
 Colors myColor = Colors.RED;
 System.out.printf("MY COLOR : %s ", myColor);
 
 for(Colors c : Colors.values()){
   System.out.println(" \n" + c);
 
 } 
 System.out.println("My color rgb value " + myColor.rgbValue());
   }
   }
}