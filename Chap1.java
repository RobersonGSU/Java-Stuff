/**
Comment
*/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class Chap1
{

   public static void main(String[]args) throws Exception
   {
      System.out.println("Hello, World!");
      
       
      JOptionPane.showMessageDialog(null, "Hello, World!");
      
      // Making a comment.
     
      
      
      JOptionPane.showMessageDialog(null,"2+2 = " +(2+2));
      
      String userName1= JOptionPane.showInputDialog("What is your name");
      
      System.out.println("My Name is " + userName1);
   
      URL myImage = new URL("http://2.bp.blogspot.com/-78hZDS16PZc/U-Om_5SF41I/AAAAAAAAYSg/ypO1H6VbslM/s1600/ferrari-f430-on-adv5.2-mv2-sl-by-adv.1-wheels-06.jpg");
      
      JOptionPane.showMessageDialog(null,"F430 With ADV1 Wheels","Car Goal!!", JOptionPane.PLAIN_MESSAGE, new ImageIcon(myImage));
      
      JOptionPane.showMessageDialog(null, "Welcome to this program");
      
      JOptionPane.showMessageDialog(null, "In this program you will need to enter your age name and hobby");
      
      String usersAge = JOptionPane.showInputDialog(" How old are you ");
      
      System.out.println(" Users age is " + usersAge);
      
      String usersName = JOptionPane.showInputDialog(" What is your name ");
      
      System.out.println("Users name is " + usersName);
      
      String usersHobby = JOptionPane.showInputDialog("What hobby/hobby's do you have ");
      
      System.out.println(usersHobby);
   
   URL image = new URL("https://ignite.apache.org/images/java.png");
   
   JOptionPane.showMessageDialog(null,"Java", "Java Icon", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
   
   System.out.print("Enter your age : ");
   
   int age=0;
   
   Scanner input = new Scanner(System.in);
   
   while(!input.hasNextInt())
   {
     input.next();
      System.out.println("Only integers allowed. Try again.");
       System.out.print("Enter your age : ");
      
   }
   
   age = input.nextInt();
   System.out.println("You are " + age + "Correct ? ");
   System.out.print("If you are enter y if not enter n ");
   String validationAge = input.next();
   
   while(!input.hasNext())
   {
     input.next();
     System.out.println("enter y or n ");
   }
   
   if(validationAge.equals("y"))
   {
     System.out.println("Alright");
   }
   else
   {
    while(!input.hasNextInt())
   {
     input.next();
      System.out.println("Only integers allowed. Try again.");
       System.out.print("Enter your age : ");
      
   }
   
   age = input.nextInt();
   System.out.println("You are " + age);
     
   }
   System.out.println("\u001B31;1mhello world!");
   
   // ^^ using in.hasnext stuff
   /**
   
   This was done 6/19/2017
   
   */
   }
   
}