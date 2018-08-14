/*
june 7 
*/

import java.util.*;
import java.io.*;
import java.math.*;
import javax.swing.*;
import java.net.*;

public class Prac3{

   public static void main(String[]args){
   System.out.println("program 3");
   Scanner in = new Scanner(System.in);
   System.out.println("input  the first string ");
   String first = in.next();
   System.out.println("Input the second string ");
   String second = in.next();
   int outcome = first.compareTo(second);
     if(outcome < 0){
      System.out.println("The first string comes first ");
     }
     else if(outcome > 0){
      System.out.println("The second string comes first ");
     }
     else {
      System.out.println("They are equal");
     }
     
     int grade = 107;
     
     switch(grade/10){
     case 1:
     case 2:
     case 3:
     case 4:
     case 5:
     case 6:
     System.out.println("grade is an f");
     break;
     case 7:
     System.out.println("Grade is a C ");
     break;
     case 8:System.out.println("Grade is a B");
     break;
     case 9:
     case 10:
     System.out.println("Grade is a A");
     break;
     }
     
    if(second.equals(first)){
      System.out.println("hi");
    
    }
   
   
   }
}