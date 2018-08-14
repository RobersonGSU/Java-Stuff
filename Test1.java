import java.util.*;
import java.io.*;

public class Test1{

   public static void main(String[]args) throws Exception{
   
      String ol = "Str";
      String lo = "RTR";
      System.out.println(ol.compareTo(lo));
      Scanner in = new Scanner(System.in);
      System.out.println("enter a word");
      String get = in.next();
      int chara =0;
      int spaces=0;
      int que = 0;
      int apl =0;
     //  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      // String ned = stdin.readLine();
      for(int i =0; i < get.length();i++){
      
         if(get.charAt(i)!=' '){
        
            chara++;
         }
         
         if(get.charAt(i) == '?' || get.charAt(i) == '.'||get.charAt(i) == '!'){
         que++;
         
         }
         
         if(get.charAt(i)!= ' '||get.charAt(i)!= '?' ||get.charAt(i)!= '.'){
         apl++;
         }
         
         spaces++;
      }
      
      
      
             
     System.out.println("There are " + chara + "Characters " + " question marks " + que +" There are " + apl + " apl");
     
     
     Parent tada = new Child(13, 2019);
     
     System.out.println(tada.toString());
     
     System.out.println(4.6-2.0+3.2-1.1*2);
     
     System.out.println(" We will compute factorial . Enter number ");
     int fact = in.nextInt();
     
     factorial(fact);
     
     System.out.println(factorial(fact));
     
     System.out.println(" Power n^p");
     System.out.println(" n : " );
     int power = in.nextInt();
      System.out.println(" p : " );
     int powerp = in.nextInt();

     
     powers(power, powerp);
     
     System.out.println( powers(power, powerp));
     
     System.out.print(" Enter a name : ");
     String laland = in.next();
      
   
     
     int d = (int)6.5;
     
     System.out.println(d);
     
     //writeback(laland);

     
     
     
     
     

   
   }
   /*
   public static String writeback(String n){
   String s = n;
   int i = s.length();
      if(i > 0){
      
        System.out.print(s.substring(s.charAt(s.length()-1)));
          writeback(s.substring(0,s.length()-1));
       
          }
      else{d
      return  " A ";
      }
      return s;
    } turn to void 
    */
      public static int powers(int n , int p){
      
      int product = 1;
      int casd = 0;
      
      if(n == 0 || p==0){
     // System.out.println("Returned 1 ");
      //casd++;
      return 1;
      }
      
      
      
      else{
         
      return n * powers(n , p-1);  
       // casd++;
         // System.out.println("operation " + casd +" POWERS IS NOW " + product);
        
      
    // return n * powers(n , p-1);
      
      
      }
      
      }
   
   public static int factorial(int fact){
      int num = fact;
      int product = 1;
        if(num ==0){
        return 1;
        }
        else{
        return product = num * factorial(num-1);
        }
      
     }
   
   
}