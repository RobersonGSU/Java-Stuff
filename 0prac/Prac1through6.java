/*
June 13

*/

import java.util.*;
import java.math.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Prac1through6 {
 
   public static void main(String args[]) throws Exception{
      
       /*
      System.out.println("Hello,World"); 
      JOptionPane.showMessageDialog(null,"Hello there");
      String  name = JOptionPane.showInputDialog("What is thy name?");
      System.out.println("Thy name is " + name );
      System.out.println(" " + 3  + 3 + 4);
      URL image = new URL("https://images.tynker.com/blog/wp-content/uploads/09-05-2017-why-coding-infographic-blog.png");
      JOptionPane.showMessageDialog(null, "This is the Message", "This is a Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
      
      JOptionPane.showMessageDialog(null,"This is the end of chapter 1 ");
      */
      System.out.println("Start of chapter 2 ");
      /*
      Primitive data types are : 
      int  long byte short  double float char boolean
      */
      final float PRICEOFSPRITEBOTTLE = 3.56f;//always put f after the number for floating point types
      
      BigInteger test = new BigInteger("231256");
      BigInteger test2 = new BigInteger("2312564");
      BigInteger sum = test.subtract(test2);
      
      System.out.println(12%11);
      
      System.out.println(Math.pow(3,2));
      
      int randomNumber = (int)(Math.random()*50);
      System.out.println(randomNumber);
      Random random = new Random();
      int chose = random.nextInt(100);
      System.out.println(chose + " chose " );
      
      chose++;
      
      chose *=3;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of items ");
      int itemCount = in.nextInt();
      
      String name = "HARRY12345";
      int o = name.length();
      
      System.out.println(Character.isDigit(name.charAt(7)));
      
      int n = 12;
      int op = 13;
      int s = n > op ? 45 : n ; 
      System.out.println(s);
      
      //Boolean operator ^ != && ||
      double io = 312.1234567;
      System.out.printf("There is something here %10.2f and yeah " , io);
      /*
       String grade= " ";
         int grades =0;
      do{
      System.out.println("What was your grade for system level? ");
      
      grade = in.next();
       
      for(int i =0; i < grade.length(); i++){
         if(!(Character.isDigit(grade.charAt(i)))){
           System.out.println("What was your grade for system level? ");
             grade = in.next();
         }
      }
      grades = Integer.parseInt(grade);
      }while(!(grades > 0) && !(grades < 100));
      
     // int grades = Integer.parseInt(grade);
      switch(grades/10){
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6: System.out.println("You made an f");
      break;
      case 7:System.out.println("You made a c ");
      break;
      case 8:System.out.println("You made a b");
      break;
      case 9:
      case 10:
      System.out.println("You made an A");
      break;
     default:  System.out.println("What ever you put in is invalid i guess :/ ");break; 
      
      }
      */
 
         double [] values;
   
      values = new double[10];
     
      for(int i =0; i < 10; i++)
      {
      
      values[i] = i;

      }
      
      //copying array reference
      double[] values2 = values;
      
      
      for(double ssasd : values){
      
      System.out.println(ssasd);
      }
      
      
      double totals = 0;
      
      for(double das : values2){
      
      totals += das;
      }
      
      totals = totals/values2.length;
      
      System.out.println("The totals is " + totals);
      
      double [] asd = Arrays.copyOf(values2,values2.length);
      
      int sid = 0;
      int l =0;
      while(sid<asd.length){
         if(asd[sid] ==0){
         
            l++;
         }
      sid++;
      }
      double [] fad = {3,2,5,8,1,4,2,4,7};
      System.out.println(l);
      
      Arrays.sort(fad);
      
      System.out.println(Arrays.toString(fad));
      
      // binary searc here
      boolean found = false;
      int low =0;
      int high = fad.length -1;
      int pos =0;
      
      while(low <= high && found != true){
      pos = (low + high)/2;
      
      if(fad[pos] == 7){found = true;}
      else if(fad[pos] < 7 ){
         low = pos +1;
      }
      else {
         high = pos -1;
      
      }
      
      }
      
      if(found = true){
      
      System.out.println("Found at position " + pos);
      }
      else{
      System.out.println("Not found " + pos);
      
      }
      
      
      int [] [] iop = new int[3][3];
      
      
      System.out.println(iop.length);
      
      for(int i=0; i < iop.length; i++){
         for(int j=0;j < iop.length;j++){
               iop[i][j]= i * j;
         
         }
      
      }
       for(int i=0; i < iop.length; i++){
         for(int j=0;j < iop.length;j++){
           System.out.print(iop[i][j] + ", ");
         
         }
         System.out.println();
      
      }      
      
      
    
      
      
      
      ArrayList<String> uio = new ArrayList<String>();
      
      uio.add("LAd");
      uio.add("Yep");
      
      uio.set(0,"cleetus");
      
   }
   
}