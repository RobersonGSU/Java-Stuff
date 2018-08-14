/*
June 5
Again at java :/
*/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;
import java.math.*;


public class Prac1{
   public static void main(String args[]) throws Exception{
   
   System.out.println("Hello there my name is  ");
   
   System.out.println("The sum of 9+0 is " + (9+0));
   
   System.out.print("This will remain on the same line and not create a new line ");
   System.out.println("After the end of this there will be a new line");
   System.out.print("This new one yeah yea yeah !!!");
   System.out.println("21");
   
   JOptionPane.showMessageDialog(null,"Hi there mate");
   String age = JOptionPane.showInputDialog("Whats your age");
   System.out.println("Age : " + age);
   
   
   String name = JOptionPane.showInputDialog("What is thy name i demand!!");
   System.out.println("I'm sorry " + name + " I can not do what you just asked!!! >:D");
   
   URL image = new URL("https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2018/05/Wyvern-programming-languages-in-one.jpg");
   JOptionPane.showMessageDialog(null,"Hello","title",JOptionPane.PLAIN_MESSAGE, new ImageIcon(image));
   
   System.out.println(Math.PI);
   
   int powers = (int) Math.pow(3,3);
   System.out.println(powers);
   
   final double PRICEOFGLASSES = 99.99;
   
   System.out.print("How many pairs of glasse are you going to buy " + name + " Today eh?");
   Scanner in = new Scanner(System.in);
   double usersSelectedQuantity = in.nextDouble();
   double totalPrice = usersSelectedQuantity *  PRICEOFGLASSES;
   System.out.printf("total price is %5.2f  " , totalPrice);
   
 int max = Math.max(23,56);
 
 System.out.println("Max is " + max);
   
   BigInteger bigNumber = new BigInteger("12021331");
   BigInteger smallNumber = new BigInteger("2");
   BigInteger total = bigNumber.multiply(smallNumber);
   
   System.out.println("The biginteger product is " + total);
   
   BigDecimal bigDeci;
   BigDecimal smallDeci;
   
  max++;
  max+=32;
  
  max-=32;
  max--;
  
  //remainder is modul %
  
  System.out.println(4%3);
   
   
   
   }

}