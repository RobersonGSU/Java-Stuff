package assg;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
public class tester {
	public void checkFile(){
		//type file is from java.io package
		File x = new File("test.txt");
		if(x.exists()){
			System.out.println("File exists");
		}
		else
		{
			System.out.println("No File");
		}
	}
	Formatter y;
	public void createFile(){
		try{
			y=new Formatter("create.txt");
		}catch(Exception e){
			System.out.println("CAn not create file");
		}
		y.format("%s %s %s", "I","am","Chinese");
		y.close();
	}
	Scanner z;
	public void readFile(){
		try{
			z = new Scanner(new File("create.txt"));
			
		}catch(Exception e){
			System.out.println("Can not find the file");
		}
		while(z.hasNext()){
			String a = z.next();
			String b = z.next();
			String c = z.next();
			System.out.println(a +" "+ b + " " + c);
		}
		z.close();
	}
	
	public static void main(String[]args){
		tester obj = new tester();
		obj.checkFile();
		obj.createFile();
		obj.readFile(); 
      
     Scanner in = new Scanner(System.in);
     int da = in.nextInt();
     int grade = da;
     String tada="";
     if(da >=90){
     tada = "A";
     }	
     
     switch(grade/10){
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      tada= "F";
      
      break;
      case 7:
      tada = "c";
      break;
      case 8:
      tada = "B";
      break;
      case 9:
      case 10:
     tada = "A";
     break;
     }
     System.out.println(tada);
     
     int i=5, l=2;
     if(i>=10)
        if(l > 7)
      System.out.println("D");
     else
     System.out.println(" bla ");
  
 	}
}
