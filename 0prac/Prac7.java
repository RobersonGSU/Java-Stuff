import java.util.*;
import java.io.*;
import javax.swing.*;
import java.math.*;
import java.net.*;

public class Prac7{
   
   public static void main(String[]args) throws Exception{
      
      //File object being constructed 
       File myFile2 = new File("text2.txt"); 
      File myFile = new File("text.txt"); 
      
      
      Scanner in = new Scanner(myFile); // This will read text from text.txt if it exist
    //  in.useDelimiter("[^0-99]"); // will only allow numbers from 0-99
      String num = " ";
      in.useDelimiter("[^a-zA-Z]");
      
      String value = "";
      
      while(in.hasNext()){
         value = in.next();
         
         System.out.println(value);
      }
          
 
         
   
      
       PrintWriter out = new PrintWriter(myFile2);
      out.print("Hello there ");
      
      
      
      in.close();
      out.close();
      //File object to construct a scanner object
      
   
 
      
   
   
   
   // Practice instanceof
   
   
   
   }






}