package train9demo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main1<t> {
	

public void printlist(List<t> ar) {
	Iterator or=ar.listIterator();
	while(or.hasNext())
		System.out.println(or.next());
}

public void check(List<t> ar,String s) {
	try {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String  ");
s=br.readLine();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	if(ar.contains(s)) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
		System.out.println("Welcome "+ar.get(ar.indexOf(s)));
		System.out.println("to print list : Yes or No");
		String b;
		b=br.readLine();
		if(b.equalsIgnoreCase("yes")) {
			printlist(ar);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}else {
		System.out.println("does not exist");
	}
	}

public void getList(List<t> ar,int n) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the size of list");
	try {
	n=Integer.parseInt(br.readLine());
	while(n>0) {
		System.out.println("enter the value");
		 t s=(t)br.readLine();
		ar.add(s);
		n--;
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	
	Main1<String>  m=new Main1();
	ArrayList<String> a=new ArrayList<>();
	int n=0;
	String s=null;
	m.getList(a, n);
	m.check(a, s);
	
	
	
}
}
