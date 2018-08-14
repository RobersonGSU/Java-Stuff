package day1.example;
public class TestingClass {

   public static void main(String[]args) {
   
   ArrayTing theTingTaDa = new ArrayTing();
   int arr1[][] = new int[25][25];
   int arr2[][] = new int[25][25];
   System.out.println("Enter the first array:");
   theTingTaDa.setArray(arr1);
   System.out.println("Enter the second array:");
   theTingTaDa.setArray(arr2);
   
   }
   
   public static void matrixMultiply(int arr1[][], int arr2[][]){
    int sum=0;
    int sum2[][]= new int[25][25];
    for(int row=0; row<25; row++)
    {
      for(int col=0; col<25; col++)
      {
       sum=0;
       for(int k=0; k<25;k++)
        {
        sum+=arr1[row][k] * arr2[k][col];
        }
        sum2[row][col]=sum;
        System.out.print(sum2[row][col]+"\t");
       }
       System.out.println();
     }
 }
 
 } 