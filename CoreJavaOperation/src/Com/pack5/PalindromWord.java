package Com.pack5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PalindromWord {
	public void isPalindrom(String name[])
	{
		System.out.print("Palindrom words are : ");
		for(String word:name)
		{
			String rev="";
		    for(int i=word.length()-1;i>=0;i--)
		   {
			  rev=rev+word.charAt(i);
		   }
		    if(rev.equalsIgnoreCase(word))
			   System.out.print(word+", ");
		
		}
		System.out.println();
	
	}
	public void checkCharacter()
	{
		String st="mam"; int flag=0;
		char arr[]=st.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[0]==arr[arr.length-1])
				flag=1;
				
		}
		if(flag==1)
			System.out.println("same character word : "+st);
		else
		System.out.println("not same character word : "+st);
		System.out.println();
	}
	public void isFirstAndLastSameWord(String arr[])
	{
		System.out.println("Same Character Words ");
		for(String name:arr)
		{
			String word=name.toUpperCase();
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(0)==word.charAt(word.length()-1))
				{
					System.out.print(word+" ");
					break;
				}
				
			}
		}
	}
	public void toDecimal(int num)
	{
		int n=0,reminder,decimal=0;
		
		while(num>0)
		{
			reminder=num%10;
			decimal+=reminder*Math.pow(2, n);
			num=num/10;
			n++;
		}
		System.out.println(decimal);
		
	}
	public void replaceZeroToOne(int num)
	{
		String st=num+"";
		String str=st.replace("0", "1");
		System.out.println(str);
	}
	public void replace(int num)
	{
		String st=Integer.toString(num);
		String str="";
		for(int i=0;i<st.length();i++) 
		{
			if(st.charAt(i)=='0')
				str=str+'1';
			else
				str=str+st.charAt(i);
		}
		System.out.println(str);
	}
	public void prime(int num)
	{
		int c;
		for(int i=3;i<=num;i++)
		{
			c=0;
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
					c++;
					
			}
			if(c==2)
			
				System.out.println(i);
		}
	}
	public void checkPrime(int num)
	{
		int flag=0;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
				flag=1;
		}
		if(flag==1)
			System.out.println("Not Prime no");
		else
			System.out.println("Prime no ");
	}
	public void countNumber(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
	public void convertNumberToWord(int num)
	{
		int temp=num,rem,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum*10+rem;
			temp/=10;
		}
		System.out.println(sum);
		while(sum>0)
		{
			rem=sum%10;
			switch(rem)
			{
			case 0 : System.out.println("Zero");
			break;
			case 1 : System.out.println("One");
			break;
			case 2 : System.out.println("Two");
			break;
			case 3 : System.out.println("Three");
			break;
			case 4 : System.out.println("Four");
			break;
			case 5 : System.out.println("Five");
			break;
			case 6 : System.out.println("Six");
			break;
			case 7 : System.out.println("Seven");
			break;
			case 8 : System.out.println("Eight");
			break;
			case 9 : System.out.println("Nine");
			break;
			
			
			}
			sum/=10;
		}
	}
	public void element(Integer []ar)
	{
		
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(ar));
		System.out.println(ts);
		
	}
	public void elements(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}
	public void sortElement(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int x:arr)
			System.out.print(x+" ");
	}
	public void reverse(int num)
	{
		if(num<10)
			System.out.println(num);
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
	}
	public int lengthString(String st)
	{
		if(st.equals(""))
			return 0;
		else
		{
			return lengthString(st.substring(1))+1;
		}
	}
	public int fact(int num)
	{
		if(num>1)
			return fact(num-1)*num;
		else
			return 1;
	}
	public void removeCharac(String st)
	{
		int count;
		for(int i=0;i<st.length();i++)
		{
			count=0;
			for(int j=0;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
					count++;
			}
			if(count==1)
				System.out.println(st.charAt(i));
		}
	}
	public static void main(String[] args) {
		PalindromWord obj=new PalindromWord();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter binary number");
//		String name[]= {"MOM","daD","malayalam","liril","java","madam"};
//		obj.isPalindrom(name);
//		obj.checkCharacter();
//		obj.isFirstAndLastSameWord(name);
		//int num=sc.nextInt();
		//obj.toDecimal(num);
		//obj.replaceZeroToOne(num);
		//obj.replace(num);
		//obj.prime(num);
		//obj.checkPrime(num);
		//obj.countNumber(num);
		//obj.convertNumberToWord(num);
		//Integer arr[]= {5,20,56,8,10,45,12};
		//obj.element(arr);
		//int arr[]={5,20,56,8,10,1,45,12};
		//obj.elements(arr);
		//int arr[]={5,20,56,8,10,45,12};
		//obj.sortElement(arr);
		//obj.reverse(4582123);
		//int sum=obj.lengthString("Rakesh");
		//System.out.println(sum);
		//int res=obj.fact(5);
		//System.out.println(res);
		sc.close();
		obj.removeCharac("aabbcraddcec");
	}

}
