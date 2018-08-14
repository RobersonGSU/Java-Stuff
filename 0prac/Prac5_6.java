/*
June 9
*/
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Prac5_6 {

   public static int powa(int base, int exponent){
     
      int exp = exponent ;
      int based =base;
      System.out.println(" ex p " + exp + "based " + base);
      if(exp ==1){
         return based  ;
      }
      else {
      based = based * powa(based,  exp - 1);
     return   based;
      
      }
    
    }
   
      public static void main(String args[]){
         
         System.out.println("This is for chapter 5 and 6 ");   
         Scanner in = new Scanner(System.in);
         
         System.out.println("Enter the base number ");
         int baseN = in.nextInt();
         System.out.println("Enter the exponenet ");
         int exponenet = in.nextInt();
         System.out.println(baseN + "  " + exponenet);
   
      System.out.println(powa(baseN,exponenet));
      
         
   double [] values = new double[15];
   
   for(int i =0; i<15; i++){
   
      values[i] = i;
   }
   
   double total = 0;
   
   for(int i = 0; i<15; i++){
   System.out.println(values[i]);
   total +=values[i];
   }
System.out.println(total + "total");
 

for(double c : values){

   System.out.println("c " + c);
}

  for(int i = 0; i<15; i++){
     if(values[i] == 7){
      for(int k =i; k<values.length -1;k++){
         values[k] = values[k+1];
      }
     }
   }
   
      for(int i = 0; i<15; i++){
   
   System.out.println(values[i]);
   
   
 
   }
   
 double co [] = Arrays.copyOf(values, values.length); // to double the arrays length multiply values.length
 
   
        for(int i = 0; i<15; i++){
   
   System.out.println("Copy" + co[i]);
   
   
 
   }
   
   ArrayList<Integer> names = new ArrayList<Integer>();
   
   String op = String.format("The  area %d and %d " , 3, 5);
 System.out.printf(op);
 
 int pow = 3;
 
 int pad = 4;
 
 int lad = 3;
 
 // one has to be false for 4 to be printed
  if(pow == lad ^ lad == 3){
   System.out.println(" \n 4");
  }
  else {
   System.out.println("\n5");
  }
   
}

}