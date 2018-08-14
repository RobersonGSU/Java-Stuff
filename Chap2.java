/**
Rob 
*/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class Chap2
{
   public static void main(String[]args)throws Exception
   {
      Date todaysDate = new Date();
      System.out.println("Today's date is " + todaysDate);
      System.out.println();
      
      URL myImage = new URL("http://www.dubmagazine.com/home/media/k2/items/cache/a226b0ff22852a741eab13286ff6098e_XL.jpg");
      
      JOptionPane.showMessageDialog(null,"Liberty Walk DDE 458 Italia", "Goal 458 Italia", JOptionPane.PLAIN_MESSAGE , new ImageIcon(myImage));
      
      
      
      double priceOf1Case = 15.99;
      JOptionPane.showMessageDialog(null, "Program computes price of x amount of cases " );
      JOptionPane.showMessageDialog(null, "One case cost 15.99 ");
      
      String usersAmountOfCases= JOptionPane.showInputDialog(" How many cases would you like to buy?");
      System.out.println("User buys " + usersAmountOfCases + " cases ");
      
      
      
      double totalCostForCases = priceOf1Case * Integer.parseInt(usersAmountOfCases);
      
      JOptionPane.showMessageDialog(null, "Your total amount is " + totalCostForCases);
      
      System.out.println("User spends " + totalCostForCases);
      
      System.out.println("We will find the remainder of 9/7 ");
      
      System.out.println(" The remainder of 9/7 is " + 9%7);
      
      JOptionPane.showMessageDialog(null, "9 to the seventh power is " + Math.pow(9,7));
      
      double changeToInt=3.051587;
      
      int isIntNow= (int) changeToInt;
      
      System.out.println("This is it in floating point form " + changeToInt);
      
      System.out.println("This is it converted =D " + isIntNow);
      
      // Input stuff Java.util is the package  scanner is the class
      
      Scanner input = new Scanner(System.in);
      
      
      System.out.printf("%3d %.2f\n", isIntNow, changeToInt); // formatting output for integers and floatings point nums
      
      double price= 3.052;
      
      System.out.printf("Price: %5.2f\n", price);
      
      String testingSubchar = "RoberLubSomTa";
      
      System.out.println(testingSubchar.substring(1,8));
      
      System.out.println(testingSubchar.charAt(5));
      
      // Sum and difference of two numbers from user
      
      System.out.println("This program will take the difference sum and product and average of two integers you give ");
      System.out.print("First number :\n ");
      int firstNum= input.nextInt();
      System.out.print("Second Number :\n");
      int secondNum = input.nextInt();
      
      
      
      int productOfUsersNums= firstNum*secondNum;
      
      int sumOfUsersNums= firstNum + secondNum;
      
      int differenceOfUsersNums = firstNum - secondNum;
      
      int averageNums = (firstNum + secondNum)/2;
      
      System.out.println("The product is : " + productOfUsersNums);
      
      System.out.println(" The difference is : " + differenceOfUsersNums);
      
      System.out.println(" The sum is : " + sumOfUsersNums);
      
      System.out.println( " The average is : " + averageNums);
      
      
      // This will output the area of a circle
      
      System.out.println("What is the radius of your circle ");
      double usersRadius = input.nextDouble(), areaOfCircle = Math.pow(usersRadius,2) * Math.PI, circumfrenceOfCI = Math.PI *2 *usersRadius;
   
   
      
   
      
      System.out.println("The area of your circle is : " + areaOfCircle);
      
      System.out.printf(" The circumfrence of your cirfle is: %10.2f\n", circumfrenceOfCI  );
      
      int bigger=5689;
      
      int whobigger=96325;
      System.out.println("The bigger number is " + Math.max(bigger,whobigger));
      
      
      
      
      
   
   }


}