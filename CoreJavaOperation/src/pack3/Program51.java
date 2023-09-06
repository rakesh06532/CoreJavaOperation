package pack3;

import java.util.Scanner;

public class Program51 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
   StringBuilder s1=new StringBuilder();
    s1.append(s);
    StringBuilder s2=s1.reverse();
    System.out.println(s+"/"+s2);
    sc.close();
    
 
	
	
}
}
