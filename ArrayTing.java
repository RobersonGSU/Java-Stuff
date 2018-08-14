package day1.example;
import java.util.*;
import java.io.*;



public class ArrayTing {
   public void setArrray(int arr[][]){
   Scanner input = new Scanner(System.in);
   for(int row=0; row<arr.length;row++){
   for(int col=0; col<arr[row].length;col++){
   System.out.printf("Element[%d][%d]:", row, col);
   arr[row][col] = input.nextInt();
   }
  }
}
   }