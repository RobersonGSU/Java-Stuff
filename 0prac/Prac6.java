import java.util.*;
import java.io.*;
import java.math.*;
import javax.swing.*;

public class Prac6{

   public static void main(String[]args){
      double [] myArray = new double [11];
      
      for(int i=0; i<11; i++){
         
         myArray[i] = i;
      } 
      
      System.out.println(Arrays.toString((myArray)));
      
      double scores [] = myArray;
      
      scores[5] = 34;
      
            System.out.println(Arrays.toString((myArray)));
            
            double total =0;
            
            for(double e : myArray){
            total += e;
               System.out.print(e + ",");
            
            }
            
            System.out.println();
            
            System.out.println(total);
            
            /* Removing an element in an array */
            
            for(int i =0; i<myArray.length; i++){
               if(myArray[i] == 34){
                     for(int k =i; i<myArray.length-1;i++){
                     
                        myArray[i] = myArray[i+1];
                     }
                  
               
               }
            
            }
            
            System.out.println(Arrays.toString(myArray));
            
            int iodds = 90;
            for(int i =0; i<myArray.length; i++){
               if(i == 5){
                  for(int k =i; k<myArray.length-1; k++){
                        
                        myArray[k] = myArray[k+1];  
                        
                        
                  
                  }
               
               }
            
            }
            
            
            System.out.println(Arrays.toString(myArray));
            
            
            double socres [] = Arrays.copyOf(myArray , myArray.length);
            
            Arrays.sort(myArray);
            
            //To sort partially filled array do Arrays.sort(myArray, 0 , myArray.length)
            
            //todo binary search
            
            int [][] bam = new int[3][3];
            
            for(int i=0;i<3;i++){
               for(int k=0; k<3;k++){
                  
                  bam[i][k] = k;
               
               }
            
            }
            
 int [][] bam2 = {
                              { 1,2,3},
                              {4,5,6}
                           };
   
   ArrayList<Float> fda = new ArrayList<Float>();
   
   fda.add(2.3f);
   fda.add(7.3f);
   fda.add(1.2f);
   fda.add(0.5f);
   
   System.out.println(fda);
   
 fda.set(1,8.3f);
 fda.set(3,0.1f);
 
   System.out.println(fda);
   
   fda.remove(3);
   
   System.out.println(fda.get(1));
   
   
   //Making a copy of an arraylist 
   
   ArrayList<Float> fda2 = new ArrayList<Float>(fda);
   
   
   System.out.println(fda2);
   
   for(int i=0; i<fda2.size(); i++){
      fda2.remove(i);
   
   }
   
   System.out.println(fda2);
   
   Random myRandom = new Random();
   
   int ntwo = myRandom.nextInt(100) ;
   
   ArrayList<Integer>fda22 = new ArrayList<Integer>();
   System.out.println(ntwo);
   
    for(int i=0; i<10; i++){
    ntwo = myRandom.nextInt(100);
      fda22.add(ntwo);
   
   }
   
   System.out.println(fda22);
   


   
   
   
   
   
   
   
   
   
   
   
   }
   
 }