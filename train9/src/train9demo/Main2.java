package train9demo;

import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Aadhar nummber");
	   String s=sc.next();
	   try {
	   if(s.length()==12) {
		   System.out.println("Aadhar verified");
	   }
	   else {
		   throw new InvalidAadharException(s);
	   }
	   }catch(InvalidAadharException e){
		  System.out.println(e);
	   }
}
}
