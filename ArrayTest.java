import java.io.*;
import java.util.*;
import javax.swing.*;

public class ArrayTest{
   public static void main(String[]args){
   /*
          Date today = new Date();
          System.out.println("Name: Roberson \n" + "Todays date is " + today);
          JOptionPane.showMessageDialog(null,"Name: Roberson \n" + "Todays date is " + today);
          ArrayList<Integer> myUpArray = new ArrayList<Integer>();
          
          myUpArray.add(2);
           myUpArray.add(3);
          myUpArray.add(4);
           myUpArray.add(5);
          myUpArray.add(6);
           myUpArray.add(7);
          myUpArray.add(8);
           myUpArray.add(9);
          myUpArray.add(10);
           myUpArray.add(11);
          myUpArray.add(12);
          
           ArrayList<Integer> myDownArray = new ArrayList<Integer>();
           myDownArray.add(11);
           myDownArray.add(10);
           myDownArray.add(9);
           myDownArray.add(8);
           myDownArray.add(7);
           myDownArray.add(6);
           myDownArray.add(5);
          myDownArray.add(4);
          myDownArray.add(3);
          myDownArray.add(2);
          myDownArray.add(1);
          */
                   
        int [] n = new int[4];
        Random rand = new Random();
        int value = rand.nextInt(50)+1;
        
        int k=0;
        
        
      for (int rows = 0; rows < n.length; rows++) {
			   System.out.println();
			    
		       System.out.print(" [ ");  
		       
		     
			   
			    for (int numOfCols = 0; numOfCols < n.length; numOfCols++) {
             k+=1;
			 
			        n[numOfCols] = k;  // Creates Random integers for the matrix starting from 1 and ending at 30
			 
                 System.out.print(n[numOfCols]+ "\t");
			        
                 
                 
                 
			      
			        
			        
			        
			    }
				  System.out.print(" ] "); //after each row a closing bracket is placed 
			}
                
         System.out.println();
          System.out.println();
         Scanner ta = new Scanner(System.in);
         System.out.println("How big of an array do you want ?");
         int sizeArr = ta.nextInt();
         int mnm [] = new int[sizeArr];
          int mnnnm [] = new int[sizeArr];
         
         
         System.out.println(mnm.length);
         
         for(int row = 0; row < mnm.length; row++)
         {
         System.out.println();
            for(int col=1; col<mnm.length;col++)
            {
               Random number = new Random();
               int nums = number.nextInt(50);
               mnm[row]= nums;
               Arrays.sort(mnm);
                
           
               }
               System.out.print(Arrays.toString(mnm)+"\t");
                     
                  
         }
         System.out.println();
       fromoneAndUp(mnm);
       
       System.out.println();
       fromoneAndUp(mnnnm);
       
       System.out.println();
       
       multiplyop(mnm/*, mnnnm*/);
       
       int l = 9%8;
       int m = 9%9;
       
       System.out.println("D" + l + m); // prints string D10
       
       
         
       System.out.println("multiplly " );
       int dadsf = ta.nextInt();
       int ldsa = ta.nextInt();
       String sign = "";
       int product = dadsf * ldsa;
       if(product<0){
       sign = "negative";
       }
       else if(product > 0){
       sign = "positive";
       }
       else{
       sign  ="zero";
       }
       System.out.println("" + dadsf +" * " + ldsa + " is " + sign);
              
              // build a clock
         
         
         
         }
         
         public static void fromoneAndUp(int map[])
         {
           int k = 0;
           for(int lap =0; lap<map.length; lap++)
           {
             System.out.println();
           System.out.print("[ ");
           
               for(int pap =0; pap<map.length; pap++)
               {
                k+=1;
                map[pap] = k;
                System.out.print(k + "\t");
               
               
               }
               

              System.out.print(" ] ");

           }
           
           
           
                   
         }
         
         
          public static void multiplyop(int lel[]/*, int mem[]*/)
           {
             // length of lel
             int poppadappe = lel.length;
            // int memea = mem.length;
            int sum [] = new int[poppadappe];
             
                for(int k4 =0; k4<poppadappe;k4++)
                {
                  System.out.println(lel[k4]+"\t");
                 
                }
                
           

               
           
           
           }
	 }