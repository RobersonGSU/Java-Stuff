package today;
import java.io.*;
import java.util.*;
public class BasicFileIO {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
	//System.out.println("Enter a few characters ");
	File file = new File("test.txt");
	try{
		PrintWriter outPut = new PrintWriter(file);
		outPut.println("My name is Rob, ");
		outPut.println(" My age is something");
		outPut.close();
	}catch(Exception e){
		System.out.println("Error :n" + e);
	}
	int words = 0;
	int lines = 0;
	int chars =0;

	int sentences =0;
	int punctuations = 0;
	int vowels =0;   // done
	int characters =0;
	
	try{
		Scanner in = new Scanner(file);
		while(in.hasNextLine()){
			lines++;
			String s = in.nextLine();  // each line will be read from the text file
			
		 //	chars+= s.replaceAll(" ","").length();
			if(s!=" "){
				chars+= s.length();
			}
			
			for(int i = 0; i < s.length(); i++){
				char ieo = s.charAt(i);
				if(ieo != ' '||ieo == ' '||ieo == 'i'){
					vowels++;
				}
			
			for(  i = 0; i < s.length(); i++){
				  ieo = s.charAt(i);
				if(ieo == 'a'||ieo == 'e'||ieo == 'i'||ieo == 'o'||ieo == 'u'){
					vowels++;
				}
				
			}
			
			for(int l =0; l<s.length(); l++){
				int leo = s.charAt(l);
				if(leo == '?'||leo == '.'||leo == '!'){
					
					punctuations++;
				}
			}
			
			
			 
			System.out.println("number of words" + words + " num of chars " + chars + " lines : " + lines);
	System.out.println("number of vowels is " + vowels);
	System.out.println("number of punctuations is " + punctuations); 
		}
		
		in.close();
		
	} 	 
	
	

	}catch(Exception e){
		
	}
}

}
