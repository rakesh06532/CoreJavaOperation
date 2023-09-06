package Com.pack4;

import java.util.Arrays;

import java.util.TreeMap;

public class CharacterMatch {
	public void getResult(String [] arr)
	{
		
		String s1=arr[0].substring(0,2);
		String s2=arr[1].substring(0,2);
		String s3=arr[2].substring(0,2);
		if((s1.equals(s2)&&s2.equals(s3))) 
		System.out.println(s1);
		else 
			System.out.println("\"\"");
		
	}
	public void getSum(int arr[],int k)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+arr[i+1]==k)
			{
					System.out.println(Arrays.asList(i+" "+(i+1)));
					break;
			}
		}
	}
	public void replaceNumber(int num)
	{
		int rem,temp=0,temp2=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
				rem=1;
			temp=temp*10+rem;
			num=num/10;
		}
		while(temp>0)
		{
			rem=temp%10;
			temp2=temp2*10+rem;
			temp=temp/10;
		}
		System.out.println(temp2);
	}
	public void changeChar(int num)
	{
		String str="";
		String st=Integer.toString(num);
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='0')
			{
				str=str+'1';
			}
			else
				str=str+st.charAt(i);
		}
		System.out.println(str);
	}
	public void frequencyChar(String st)
	{
		int c,mc=0;char ch=0;
		for(int i=0;i<st.length();i++)
		{
			c=0;
			for(int j=0;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
					c++;
			}
			if(mc<c)
			{
				mc=c;
				ch=(char)st.charAt(i);
				
			}
		}
		System.out.println(ch+" Character "+mc+" Times");
	}
	public void characterCount(String st)
	{
		int c;
		char[]arr=st.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i=i+c)
		{
			c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					c++;
			}
			System.out.println(arr[i]+" "+c);
		}
	}
	public void characterCount2(String st)
	{
		int c;
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(int i=0;i<st.length();i++)
		{
			c=0;
			for(int j=0;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
					c++;
			}
			tm.put(st.charAt(i), c);
			
		}
		System.out.println(tm);
	}
	public void anagram(String st,String str)
	{
		
		char arr1[]=st.toCharArray();
		char arr2[]=str.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2))
			System.out.println("Anagram word");
		else
			System.out.println("Not anagram word");
	}
	public static void main(String[] args) {
		CharacterMatch obj=new CharacterMatch();
		//String []arr= {"rakesh","rahul","ramesh"};
		//obj.getResult(arr);
//		int arr1[]= {2,5,6,7,1,9,5};
//		obj.getSum(arr1,11);
//		String st="Rakesh";
//		System.out.println(st.replace("h", "hh"));
		//obj.replaceNumber(10503006);
		//obj.changeChar(1020504005);
		//obj.frequencyChar("aaaabbbbbbbacbadd");
		//obj.characterCount("aaaabbbccd");
		//obj.characterCount2("hndfhddf");
		obj.anagram("care","race");
	}

}
