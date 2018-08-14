import javax.swing.*;
import java.awt.*;
import java.util.*; 
import java.net.*;

public class ranodome {
   
   public static void main(String[]agrgs)throws Exception{
   
      JOptionPane.showMessageDialog(null,"This program will compute the product sum and quotient \n Enter a number for X and Y");
      String firstNum = JOptionPane.showInputDialog("Enter a number for X : ");
      double _usersFirstNum = Double.parseDouble(firstNum);
      String secondNum = JOptionPane.showInputDialog("Enter a number for Y: ");
      double _usersSecondNum = Double.parseDouble(secondNum);
      double product = _usersFirstNum * _usersSecondNum;
      double sum = _usersFirstNum + _usersSecondNum;
      double quotient = _usersFirstNum /_usersSecondNum;
      JOptionPane.showMessageDialog(null,"Results:\n The product is " + product + "\n quotient is " + quotient +"\n sum is " + sum);
   
      int mystery = 1;
      mystery = 1 - 2 * mystery;
      mystery = mystery + 1;
      System.out.println("mystery: " + mystery);
   
      int m = 18;
      int n = 4;
      double x = 2.5;
      double y = -1.5;
   
      double produedct = x + n * y - (x + n) * y;
   
      System.out.println(produedct);
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a random number: ");
      double numbur = in.nextDouble();
      System.out.println();
      double cubed = Math.pow(numbur,3);
      double square = Math.pow(numbur, 2);
      double fourthPow = Math.pow(numbur, 4);
      System.out.println("The square of this number is " + square + "\n This number cubed is " + cubed + "\n This number to the fourth power "+fourthPow);
      
      System.out.println("Computing the greater number (it will return 0 if they are even 0.0)");
      System.out.println("Enter a number for Z ");
      double zDD = in.nextDouble();
      System.out.println("Enter a number for M ");
       double zDED = in.nextDouble();
      System.out.println("The bigger number is " + theGreatest(zDD, zDED));
      theGreatest(zDD, zDED);
       String s = "asddd";
       String d = "123d";
     System.out.println(d.compareTo(s));  
     
     //entering string that prints the middle character or the middle two characters when its even
     System.out.println("Enter your name");
     String namers = in.next();
     String see="";
     if((namers.length()%2==0))
     {
         see = namers.substring(((namers.length()/2-1)),((namers.length()/2)+1));
     }
     else
     {
     see = namers.substring(((namers.length()/2)),((namers.length()/2))+1);
     }
     System.out.println(see);
     
     System.out.println("enter an integer");
     while(!in.hasNextInt()){
     in.next();
     }
     int age=0;
      
     
       age = in.nextInt();
   
     
     System.out.println("age " + age);
     
   
   }
   
   public static double theGreatest(double first, double second)
   {
      double _firstNum = first;
      double _secondNum = second;
      double greatest;
      if(_firstNum > _secondNum)
      {
        greatest = _firstNum;
       }
       else if(_firstNum < _secondNum)
       {
         greatest = _secondNum;
       }
       else
       {
         greatest = 0;
       }
       
       

      return greatest;
    }
}