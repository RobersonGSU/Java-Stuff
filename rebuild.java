import java.util.*;
import java.io.*;

public class rebuild{

   public static void main(String[]a){
   
     File rebider = new File("file.txt");
     try{
     PrintWriter writeIt = new PrintWriter(rebider);
     writeIt.print("Hi my name is a bot");
     writeIt.close();
     }catch(Exception e){
     
     }
     
     int vowels = 0;
     int words = 0;   
     int line = 0; 
      try{
      File bider = new File("cs.txt");
           Scanner readit = new Scanner(bider);
         while(readit.hasNextLine()){
          line++;
         
         
         int n =0; 
         String r = readit.nextLine();
         int i =0;
         for( i = 0; i< r.length(); i++){
         
         if(r.charAt(i) == 'e'||r.charAt(i) == 'a'||r.charAt(i) == 'i'||r.charAt(i) == 'o'||r.charAt(i) == 'u'){
         
            vowels++;
            
         }
        }
        
        for(i = 0 ; i < r.length(); i++){
         n++;
        if(r.charAt(i)== ' ')
        {
          words++;
        }
        
        
        else if(n == r.length()){
        words++;
        }
       
        
        }
      
         
         
         }
                      System.out.println("There are " + vowels + " vowels " + " There are " + words + " words " + " there are " + line + " lines ");
         
       readit.close();
      
     }catch(Exception e){
     }
     
     ArrayList<Integer> mine = new ArrayList<>();
     
     Random ge = new Random();
     int lo;     
     for(int l =0; mine.size()<15; l++){
     lo = ge.nextInt(15)+1;
      
      
      
      
      if(!mine.contains(lo)){
      
      mine.add(lo);
      
      }
     }
     
     System.out.println("unorganized : " + mine);
     organize(mine);
     
     ArrayList<Integer> d = new ArrayList<Integer>(5);
     d.add(1);
      d.add(2);
       d.add(3);
        d.add(4);
         d.add(5);
     System.out.println(d.toString());
     
     
            
      }
      
      public static void organize(ArrayList<Integer>d){
      
      ArrayList<Integer> n = d;
      
      for(int u =0; u< n.size(); u++){
      
         for(int p = 0; p < n.size(); p++){
         
         if(n.get(u)< n.get(p)){
         System.out.println("swith " + n.get(u) + " : " + n.get(p)); 
         
            int tem = n.get(p);
            n.set(p, n.get(u));
            n.set(u, tem);
          System.out.println("swith " + n.get(u) + " : " + n.get(p)); 
         }
         
         else if(n.get(u)== n.get(p)){
         System.out.println("Same");
                  }
         
         }
      
      
      }
              System.out.println("Sorter is " + n );
      }
    
     
   }
