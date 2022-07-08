package train9demo;
import java.io.FileOutputStream;
import java.util.*;
public class Main {
	
public static void main(String[] args) {
	Date d=new Date();
	
	int arr[]=new int[10000];
	String text;
	long seconds=System.currentTimeMillis();
	System.out.println(seconds);
	for(int i=0;i<10000;i++) {
	    arr[i]=arr[i]+arr[i]+i;
	    System.out.println(i);
	}
    
long	seconds1=System.currentTimeMillis();
text="Time Taken is "+(seconds1-seconds)+" Seconds and Date is "+d;
	try {
		FileOutputStream f=new FileOutputStream("out.txt");
		byte[] b=text.getBytes();
		f.write(b);
	}catch(Exception e){
		System.out.println(e);
	}
}
}
