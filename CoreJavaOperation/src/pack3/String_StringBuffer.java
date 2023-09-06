package pack3;

import java.util.Scanner;
public class String_StringBuffer {
	
	public void meth1()
	{
		String s=new String("Rakesh");
		String s2=s.concat(" Kumar ");
		System.out.println(s);
		System.out.println(s2);
	}
	public void meth2()
	{
		StringBuffer sb=new StringBuffer("Rakesh ");
		sb.append("Kumar");
		System.out.println(sb);
		
	}
	public void meth3()
	{
		String s1=new String("Rakesh");
		String s2=new String("Rakesh");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	public void meth4()
	{
		StringBuffer sb1=new StringBuffer("Rakesh");
		StringBuffer sb2=new StringBuffer("Rakesh");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
	public void meth5()
	{
		String s1=new String("Rakesh");
		String s2=new String("Rakesh");
		String s3= "Rakesh";
		String s4= "Rakesh";
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2);
		
	}
	public void meth6()
	{
		String s=new String("Rakesh");
		s.concat("Kumar");
		s=s.concat(" Saw");
		System.out.println(s);
	}
	public void meth7()
	{
		String s1=new String("Spring ");
		s1.concat("fall");
		String s2=s1.concat("Winter");
		s2.concat("Summer");
		System.out.println(s1);
		System.out.println(s2);
	}
	public void meth8()
	{
		String s1=new String("You cannot change me ");
		String s2=new String("You cannot change me ");
		System.out.println(s1==s2);
		String s3= "You cannot change me ";
		System.out.println(s1==s3);
		String s4= "You cannot change me ";
		System.out.println(s3==s4);
		String s5="You cannot "+"change me ";
		System.out.println(s4==s5);
		String s6="You cannot";
		String s7=s6+"change me";
		System.out.println(s4==s7);
		final String s8="You cannot ";
		String s9=s8+"change me ";
		System.out.println(s4==s9);
	}
	public void meth9()
	{
		char[] s= {'j','a','v','a'};
		String sb=new String(s);
		System.out.println(sb); 
		byte[] b= {98,99,100,101};
		String s2=new String(b);
		System.out.println(s2);
	}
	public void meth10()
	{
		String s="";
		System.out.println(s.isEmpty());//true
		String s2="Rakesh ";
		System.out.println(s2.isEmpty());//false
		System.out.println( s2.length());//7
		int x[]= {10,20,30,40};
		System.out.println(x.length);//4
	}
	public void meth11()
	{
		String s="ababab";
		System.out.println(s.replace("a","b")); 
	}
	public void meth12()
	{
		String s="abcdefg";
		System.out.println(s.substring(3)); 
		System.out.println(s.substring(3,6)); 
	}
	public void meth13()
	{
		String s="Rakesh";
		String s2="ababaaa";
		System.out.println(s.indexOf('s')); //4
		System.out.println('l');//-1
		System.out.println(s2.indexOf('b'));
	}
	public void meth14()
	{
		String s="abababaaaabbb";
		System.out.println(s.lastIndexOf('b'));//12
		
	}
	public void meth15()
	{
		String s="aBabAb";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
	public void meth16()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your city ");
		String s=sc.next().toLowerCase().trim();
		if(s.equalsIgnoreCase("Bangalore"))
			System.out.println("Welcome to Bangalore");
		else if(s.equalsIgnoreCase("Chennai"))
			System.out.println("Welcome to Chennai");
		else if(s.equalsIgnoreCase("Delhi"))
			System.out.println("Welcome to Delhi");
		else System.out.println("Please enter your valid City");
		sc.close();
	}
	public static void main(String[] args) {
		String_StringBuffer s=new String_StringBuffer();
		//s.meth1();
		//s.meth2();
		//s.meth3();
		//s.meth4();
		//s.meth5();
		//s.meth6();
		//s.meth7();
		//s.meth9();
		//.meth8();
		//s.meth10();
		//s.meth11();
		//s.meth12();
		//s.meth13();
		//s.meth14();
		//s.meth15();
		s.meth16();
	}

}
