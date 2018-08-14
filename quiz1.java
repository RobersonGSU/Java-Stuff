/*
 Name:Roberson Lubin
 Date: 9/14/2017
 CRN:86473
 */

 
import java.util.*;
import java.io.*;
import javax.swing.*;
public class quiz1 {

	 
	 
	public static void main(String[] args) {
   /*
		
		ArrayList<Integer> randNum = new ArrayList<Integer>();
		Random randers = new Random();
		int n = (randers.nextInt(15)+1);
		randNum.add(n);
		for(int i=1; i<15; i++)
		{
			n = (randers.nextInt(15)+1);
			randNum.add(n);
      
         if(randNum.get(i) == randNum.get(i))
         {
                     int tmp = randNum.get(i);
	                  randNum.set(i,randNum.get(i)) ;
	                 randNum.set(i,tmp);

         }
       
		}
		
		System.out.println("The unsorted random generated arraylist is " + randNum);
		System.out.println();
		System.out.println("The sorted ArrayList is ");
		sorting(randNum);
      */
              		 ArrayList<Integer> dalp = new ArrayList<Integer>();
                   int mlb = (int)(Math.random()* 20 + 1);
                   int i=0;
                   int k=1;
                   while(dalp.size() < 20)
                   {
                   
                   mlb = (int)(Math.random()* 20 + 1);
                   if(!dalp.contains(mlb)){
                   dalp.add(mlb);
                   }
                   
                   
                   }
                   
                   System.out.println(dalp);
               sorting(dalp);  
               
                
               int total =0;
               int numofzeros = 0;
               int idray [] = { 1,2,3,4,5,6,7,0,8,9,1,0,5,6,8,9,7,10};
               for(int id : idray){
                if(idray[total] == 0){
               
               numofzeros++;
               }
               System.out.print(idray[total]+ " ");
               total++;
               
          
               }
               System.out.println(" <-- Array idray ");
               System.out.println();
               System.out.println(" Num of zeros " + numofzeros );
               
               int talo = 0;
               for(int leh : idray){
               idray[talo] = idray[talo] * idray[talo]; 
               System.out.print(idray[talo] +" "); 
               talo++;
               
               }
               System.out.println();
               
               int opzie = idray.length;
               
               for(int lopl = 1; lopl < opzie; lopl++){
                idray[lopl -1] = idray[lopl];
                System.out.print(idray[lopl] + " " ); 
               
               }
               
               System.out.println(reverseR(idray));
                              
               
               /*
                String ds = "4564533355"; 
                int lader = 0 ;
                int getrek = 0; 
                int sze = 0;
                while(lader < sze){
                if(lader % 2 ==1){
                getrek = lader;
                 if(ds.charAt(lader) != ' '){
                 
                  System.out.print("-");
                  lader+=0;
                  
                 
                 }
                 }
                 System.out.print(ds.charAt(lader));
                 lader++;
                 
                }
                */
               ArrayList<Integer> ioa = new ArrayList<Integer>();
               
               for(int fra = 0; fra < 15; fra++){
               
              
               }
                                              

	}
	
   public static int [] reverseR(int []pwp){
     int aap = pwp.length;
     int ole =0;
     while(aap > 0){
       
         
      aap--;  // fix
     
     }
     return pwp;
   }
   
	public static void sorting(ArrayList<Integer>n){
		
		ArrayList<Integer> sortNums = n;
	    
		for(int l=0; l < sortNums.size();l++)
		{
		 
		for(int k=0; k < sortNums.size();k++)
		{
			 
			n.get(k);
			n.get(l);
			if(sortNums.get(l) < sortNums.get(k))
			{
				   int tmp = sortNums.get(l);
	                  sortNums.set(l,sortNums.get(k)) ;
	                  sortNums.set(k,tmp);
			}
			 
		 
			
		}
		
		}
		System.out.println(" sorted " + sortNums);
	}

}
