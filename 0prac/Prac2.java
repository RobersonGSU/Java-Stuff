/*
Still june 
june 7 
*/

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.math.*;
import java.net.*;

public class Prac2{
   public static void main(String[]args){
   System.out.println("Program 2");
    String random = "Man23";
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a name");
    String name = in.next();
    System.out.println("Your name is " + name + " ? ");
    System.out.println("Substring is " + name.substring(0, (name.length()/2)));
    
    System.out.println(Character.isDigit(random.charAt(2)));
    
    BigInteger j = new BigInteger("4");
    BigInteger k = new BigInteger("532323");
    BigInteger total = j.add(k);
    System.out.println(total);
    total = j.subtract(k);
    System.out.println(total);
    
    System.out.println("Enter the first integer ");
     double usersFirstInteger = in.nextDouble();
    System.out.println("Enter the second integer");
         double usersSecondInteger = in.nextDouble();
    double product = usersFirstInteger * usersSecondInteger;
    double sum = usersFirstInteger * usersSecondInteger;
     double difference = usersFirstInteger - usersSecondInteger;
    double average = (usersFirstInteger + usersSecondInteger)/2;
  double distance = Math.abs(usersFirstInteger) - Math.abs(usersSecondInteger);
   distance = Math.abs(distance);
    double max = Math.max(usersFirstInteger,usersSecondInteger);
   double min = Math.min(usersFirstInteger,usersSecondInteger);
   System.out.printf("product : %10.2f \n sum : %10.2f \n difference : %10.2f  \n average : %10.2f    \n distance : %10.2f   \n max : %10.2f \n min: %10.2f  " ,
    product , sum , difference , average , distance , max, min);
    
    
    int floor = 16;
    floor = floor < 13 ? floor   : floor -1; 
    System.out.println(" \n Floor is " + floor);
    
    
    
}
}