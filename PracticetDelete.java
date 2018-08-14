import java.util.*;
import java.util.*;
import javax.swing.*;
import java.net.*;
/*
This program is made to ask what operation the user wants to perform
and then goes to the methods it should go to
then after that in each method it will ask the user whether they would like to 
perform another operation or not

Try collecting all the numbers of the user into an array then add and multiply 
*/


public class PracticetDelete{

   public static void  multiplication(){
   
      JOptionPane.showMessageDialog(null, " You have chosen the multiplication operation " );
      String nNums = JOptionPane.showInputDialog(" How many numbers are you trying to multiply ?" );
      int n = Integer.parseInt(nNums);
      int i =0;
      double product =1;
      double convertNumsIn;
      do{
         String numsIn = JOptionPane.showInputDialog("Enter one number at a time ");
         convertNumsIn = Double.parseDouble(numsIn);
         product*= convertNumsIn;
      
         i++;
      }while(i < n);
   
      JOptionPane.showMessageDialog(null, " The product of the your numbers are " + product);
      String nextOperation = JOptionPane.showInputDialog(" Would you like to do another operation ? \n Yes(Y) No(N) ");
      if(nextOperation.equals("y")||nextOperation.equals("Y")){
         String whichOP = JOptionPane.showInputDialog("What operation would you like to perform next ?\n (m)Multiplication \n (s)Subtraction \n (d)Division \n (a)Addition ");
         if(whichOP.equals("M") || whichOP.equals("m")){
            multiplication();
         
         }
         if(whichOP.equals("M") || whichOP.equals("m")){
            addition();
         
         
         }
         if(whichOP.equals("M")|| whichOP.equals("m")){
            subtraction();
         
         }
         if(whichOP.equals("M")|| whichOP.equals("m")){
            division();
         
         }
      
      }
      else{
         JOptionPane.showMessageDialog(null, " Program Terminated ");
      }
   
   
   }

   public static void addition(){
   
      JOptionPane.showMessageDialog(null, " You have chosen the addition operation " );
      String maxAmount  = JOptionPane.showInputDialog(" How many numbers will you being adding ");
      double total = 0;
      int counter = 0;
      double getNums;
      int maxNumsTADD = Integer.parseInt(maxAmount);
      do{
         String getUserD = JOptionPane.showInputDialog("Enter numbers one at a time " );
         getNums = Double.parseDouble(getUserD);
         total+=getNums;
      counter++;
      
      }while(counter < maxNumsTADD);
   
      JOptionPane.showMessageDialog(null, " The sum of your numbers is " + total);
      String yOrNo;
      String chooseOperation;
      do{
          yOrNo = JOptionPane.showInputDialog("Would you like to do another operation ?");
      if(yOrNo.equals("y")||yOrNo.equals("Y")){
      
          chooseOperation = JOptionPane.showInputDialog(" What operation would you like to do next ? (m)Multiplication\n(s)Subtraction\n(d)Division\n (a)Addition");
         do{
            if(chooseOperation.equals("m")||chooseOperation.equals("M")){
               multiplication();
            }
            else if(chooseOperation.equals("s")||chooseOperation.equals("S")){
               subtraction();
            }
            else if(chooseOperation.equals("d")||chooseOperation.equals("D")){
               division();
            }
            else if(chooseOperation.equals("a")||chooseOperation.equals("A")){
            
               addition();
            }
              else{
         JOptionPane.showMessageDialog(null, " Program Terminated ");
      }
            
         }
         
         while(!(chooseOperation.equals("m")||chooseOperation.equals("M")||chooseOperation.equals("a")||chooseOperation.equals("A")||chooseOperation.equals("d")||chooseOperation.equals("D")||chooseOperation.equals("s")||chooseOperation.equals("S")));
      }
      
      if(!(yOrNo.equals("n")||yOrNo.equals("N"))){
         JOptionPane.showMessageDialog(null, " Program Terminated ");
      }
    
       }while(!(yOrNo.equals("y")||yOrNo.equals("Y")));
    
     
   }
   public static void main(String[]args){
   String chooseOperation;
      JOptionPane.showMessageDialog(null, " This program will do the following :\n Multiplication\n Addition\n Subtraction\n Addition ");
      do{
       chooseOperation = JOptionPane.showInputDialog(" What operation would you like to perform ? \n (m)Multiplication (s)Subtraction (a)Addition (d)Division");
     
      if(chooseOperation.equals("m")||chooseOperation.equals("M"))
      {
         multiplication();
      }
      else if(chooseOperation.equals("s")||chooseOperation.equals("S")){
         subtraction();
      
      }
      else if(chooseOperation.equals("a")||chooseOperation.equals("A")){
      
         addition();
      }
      else if(chooseOperation.equals("d")||chooseOperation.equals("D")){
      
         division();
      }
    }while(!(chooseOperation.equals("d")||chooseOperation.equals("D")||chooseOperation.equals("a")||chooseOperation.equals("A")||chooseOperation.equals("s")||chooseOperation.equals("S")||chooseOperation.equals("m")||chooseOperation.equals("M")));
   }
   
   
   public static void division(){
   double _F1;
   JOptionPane.showMessageDialog(null, " You have to chose the division operator\n" + "This operator will do F1 / F2");
  
   do{
   String firstF1 = JOptionPane.showInputDialog(" Enter your number for F1 ");
    _F1 = Double.parseDouble(firstF1);
   }while(!(_F1 <= 0 || _F1 >= 0)); 
   
   double _F2;
    String firstF2;
    do{
    firstF2 = JOptionPane.showInputDialog(" Enter your number for F2 (no division by zero)");
    _F2 = Double.parseDouble(firstF2);
   }while(!(_F2 <= 0 || _F2 >= 0)|| _F2 == 0); 
   
   double _result = _F1 / _F2;
   JOptionPane.showMessageDialog(null, " The result is " + _result);
    String _yayOnay;
    String whichOne;
   do{
    _yayOnay = JOptionPane.showInputDialog("Would you like to perform another operation ? " );
   }while(!(_yayOnay.equals("y")||_yayOnay.equals("Y")||_yayOnay.equals("n")||_yayOnay.equals("N")));
   if(_yayOnay.equals("y")||_yayOnay.equals("Y")){
   do{
   whichOne = JOptionPane.showInputDialog(" What operation would you like to perform ? \n (m)Multiplication (s)Subtraction (a)Addition (d)Division");
   
   }while(!(whichOne.equals("d")||whichOne.equals("D")||whichOne.equals("a")||whichOne.equals("A")||whichOne.equals("s")||whichOne.equals("S")||whichOne.equals("m")||whichOne.equals("M")));
    
      if(whichOne.equals("m")||whichOne.equals("M"))
      {
         multiplication();
      }
      else if(whichOne.equals("s")||whichOne.equals("S")){
         subtraction();
      
      }
      else if(whichOne.equals("a")||whichOne.equals("A")){
      
         addition();
      }
      else if(whichOne.equals("d")||whichOne.equals("D")){
      
         division();
      }

      
   }
   else{
   
   System.out.println("Program Terminated " );
   JOptionPane.showMessageDialog(null, " Program Terminated " );
   }

   
   
   }
   
   
   public static void subtraction(){
   double _F1;
   JOptionPane.showMessageDialog(null, " You have to chose the subtraction operator\n" + "This operator will do F1- F2");
  
   do{
   String firstF1 = JOptionPane.showInputDialog(" Enter your number for F1 ");
    _F1 = Double.parseDouble(firstF1);
   }while(!(_F1 <= 0 || _F1 >= 0)); 
   
   double _F2;
    do{
   String firstF2 = JOptionPane.showInputDialog(" Enter your number for F2 ");
    _F2 = Double.parseDouble(firstF2);
   }while(!(_F2 <= 0 || _F2 >= 0)); 
   
   double _result = _F1 - _F2;
   JOptionPane.showMessageDialog(null, " The result is " + _result);
    String _yayOnay;
    String whichOne;
   do{
    _yayOnay = JOptionPane.showInputDialog("Would you like to perform another operation ? " );
   }while(!(_yayOnay.equals("y")||_yayOnay.equals("Y")||_yayOnay.equals("n")||_yayOnay.equals("N")));
   if(_yayOnay.equals("y")||_yayOnay.equals("Y")){
   do{
   whichOne = JOptionPane.showInputDialog(" What operation would you like to perform ? \n (m)Multiplication (s)Subtraction (a)Addition (d)Division");
   
   }while(!(whichOne.equals("d")||whichOne.equals("D")||whichOne.equals("a")||whichOne.equals("A")||whichOne.equals("s")||whichOne.equals("S")||whichOne.equals("m")||whichOne.equals("M")));
    
      if(whichOne.equals("m")||whichOne.equals("M"))
      {
         multiplication();
      }
      else if(whichOne.equals("s")||whichOne.equals("S")){
         subtraction();
      
      }
      else if(whichOne.equals("a")||whichOne.equals("A")){
      
         addition();
      }
      else if(whichOne.equals("d")||whichOne.equals("D")){
      
         division();
      }

      
   }
   else{
   
   System.out.println("Program Terminated " );
   JOptionPane.showMessageDialog(null, " Program Terminated " );
   }
   
   }
   
   public static void addUsingArray(){
   
   }
}