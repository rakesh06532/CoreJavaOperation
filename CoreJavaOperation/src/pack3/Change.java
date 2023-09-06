package pack3;

import java.util.Arrays;

public class Change {
	public void Test()
	{
		//int to String
		int a=100;
		String s=Integer.toString(a);
		String s1=String.valueOf(a);
		String s2=String.format("%d", a);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		//String to int
		String sb="1234";
		int ab=Integer.parseInt(sb);
		int ab2=Integer.valueOf(ab);
		int ab3=new Integer(sb).intValue();
		System.out.println(ab);
		System.out.println(ab2);
		System.out.println(ab3);
		//char to int
		char c='a';
		char c1='5';
		int n,n1;
		char p='a';
		int x;
		x=p;
		n=c1-'0';
		System.out.println(n);
		n1=Character.getNumericValue(c);
		System.out.println("  "+n1);
		System.out.println(x);
		
		
	}
	public void Test2()
	{
		//int to char
		int i=65;
		char c;
		c=(char)i;
		System.out.println(c);
		//String to character arrays
		String s="java";
		char [] arr=s.toCharArray();
		for(char x:arr)
			System.out.println(x+" ");
		String s1[]=s.split(" ");
		for(String s2:s1)
		System.out.println(s2);
		//String to character array
		String sb="java is awesome";
		char [] arra=sb.toCharArray();
		
		System.out.println(Arrays.toString(arra));
		//character array to string
		char ch[]= {'a','b','c'};
		String st=String.valueOf(ch);
		System.out.println(st);
		String s2=new String(ch);
		System.out.println(s2);
		String str="Java is awesome";
		for(int j=0;j<str.length();j++)
		{
			System.out.print(str.charAt(j));
		}
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String str1=" ";
		String str2=" ";
		System.out.println(str1.isEmpty());
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
	}
	public void Test3()
	{
		String s="Java is awesome";
		char arr[]=new char[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Change obj=new Change();
		//obj.Test();
		obj.Test2();
		obj.Test3();
	}

}
