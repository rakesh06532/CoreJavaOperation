package Com.pack5;

import java.util.Arrays;

public class MixOutput {
	static void checkVowels()
	{
		char c='a';
		if(c=='a'||c=='e'||c=='a'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println(c +" is voiwel ");
		else
			System.out.println(c +" is not vowels");
		
	}
	static void checkAlphabat()
	{
		char c='Z';
		if(c>=65 && c<91 || c>=97 && c<=123)
			System.out.println(c +" is alphabate");
		else
			System.out.println(c+" is not alphabate");
	}
	static void findASCII()
	{
		char ch='2';
		int i=ch;
		System.out.println(i);
	}
	static void findLength()
	{
		String st="Rakesh   ";
		int c=0;
		for(int i=0;i<st.length();i++)
		{
			c++;
		}
		System.out.println(c);
//		int x=0;
//		for( char ch:st.toCharArray())
//		{
//			x++;
//		}
//			System.out.println(x);
	}
	static void toggleCharacter()
	{
		String st="RaKEsh";
		String st1="";
		for(int i=0;i<st.length();i++)
		{
			if(Character.isUpperCase(st.charAt(i)))
				st1=st1+Character.toLowerCase(st.charAt(i));
			else
				st1=st1+Character.toUpperCase(st.charAt(i));
		}
		System.out.println(st1);
	}
	static void countVowels()
	{
		String st="Rakesh";int c,tc=0;
		char arr[]= {'a','e','i','o','u','A','I','E','O','U'};
		for(int i=0;i<st.length();i++)
		{
			c=0;
			for(int j=0;j<arr.length;j++)
			{
			if(st.charAt(i)==arr[j])
				c++;
			}
			tc=tc+c;
		}
		System.out.println(tc);
	}
	static void removeVowels()
	{
		String st="Rakesh";
		String st1="";
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||
					st.charAt(i)=='u'||st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||
					st.charAt(i)=='O'||st.charAt(i)=='U')
			st1=st1+"";
			else
				st1=st1+st.charAt(i);
		}
		System.out.println(st1);
	}
	 static void removeVowel()
	{
		String st="RAkesh";
		String st1="";
		st1=st.replaceAll("[aeiouAEIOU]", "");
		System.out.println(st1);
	}
	 static void checkPalindrom()
	 {
		 String st="mam";
		 String st1=st.toUpperCase();
		 String st2="";
		 for(int i=st1.length()-1;i>=0;i--)
		 {
			 st2=st2+st1.charAt(i);
		 }
		 if(st1.equals(st2))
			 System.out.println("Palindrom");
	
	 }
	 static void checkPalin()
	 {
		 String st[]= {"mam","rakesh","liril","Dad"};
		
		 for(String st1:st)
		 {
			 String str=st1.toUpperCase();
			 String str1="";
			 for(int i=str.length()-1;i>=0;i--)
			 {
				 str1=str1+str.charAt(i);
			 }
			 if(str1.equals(str))
				 System.out.print(str1+" ");
		 }
	 }
	 static void reverseString()
	 {
		 String st="Rakesh";
		 for(int i=st.length()-1;i>=0;i--)
		 {
			 System.out.print(st.charAt(i));
		 }
	 }
	 static void reverseString2()
	 {
		 String st="Rakesh";
		 StringBuffer sb=new StringBuffer();
		 sb.append(st).reverse();
		 
		 System.out.println(sb);
		 
	 }
	 static void removeSpecial()
	 {
		 String st="84iee@*%T)^..?3Hj";
		 for(int i=0;i<st.length();i++)
		 {
			 if((st.charAt(i)>='A' && st.charAt(i)<='Z') || (st.charAt(i)>='a' && st.charAt(i)<='z'))
				 System.out.print(st.charAt(i));
		 }
	 }
	 static void removeSpace()
	 {
		 String st="Remove space from string";
		 for(int i=0;i<st.length();i++)
		 {
			 if(st.charAt(i)!=' ')
				 System.out.print(st.charAt(i));
		 }
	 }
	 static void getEqualsString()
	 {
		 String st[]= {"flower","flower","flush","flower"};
		 for(String str:st)
		 {
			 if(st[1].equals(str))
				 System.out.println(str);
		 }
	 }
	 static void subString()
	 {
		 String st[]= {"flying","flower","flust"};
		 String s1=st[0].substring(0,2);
		 String s2=st[1].substring(0,2);
		 String s3=st[2].substring(0,2);
		 if((s1.equals(s2)) && (s2.equals(s3)))
			 System.out.println(s1);
	 }
	 static void removeBracket()
	 {
		 String st="(a*b)=ab";
		 for(int i=0;i<st.length();i++)
		 {
			 if(!((st.charAt(i)=='(') || (st.charAt(i)==')')))
				 System.out.print(st.charAt(i));
		 }
	 }
	 static void removeBracket2()
	 {
		 String st="(a*b)=ab";
		 String str=st.replaceAll("[{[}]()]", "");
		 System.out.println(str);
	 }
	 static void countCharacter()
	 {
		 String st="Rakesha";
		 ;int c;
		 for(int i=0;i<st.length();i++)
		 {
			 c=0;
			 for(int j=0;j<st.length();j++)
			 {
				if(st.charAt(i)==st.charAt(j))
					c++;
			 }
			 if(c==1)
				 System.out.print(st.charAt(i));
		 }
	 }
	 static void countNumber()
	 {
		 String st="8rJfh9k";
		 int sum=0;
		 for(int i=0;i<st.length();i++)
		 {
			 if((st.charAt(i)>='0') && (st.charAt(i)<='9'))
			// if(Character.isDigit(st.charAt(i)))
			 {
				 sum=sum+Character.getNumericValue(st.charAt(i));
			 }
		 }
		 System.out.println(sum);
	 }
	 static void capitalizeCharacter()
	 {
		 String st="Capitalize each character of string";
		 String newStr="";
		 String str[]=st.split("\\s");
		 for(String str1:str)
		 {
			 String firstchar=str1.substring(0,1);
			 String restchar=str1.substring(1,str1.length()-1);
			 String lastchar=Character.toString(str1.charAt(str1.length()-1));
			 newStr=newStr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
		 }
		 System.out.println(newStr);
	 }
	 static void getMaxCharacter()
	 {
		 String st="aabbbbbacdac";
		 int c,mc=0;char ch=0;
		 for(int i=0;i<st.length();i++)
		 {
			 c=0;
			 for(int j=0;j<st.length();j++)
			 {
				 if(st.charAt(i)==st.charAt(j))
					 c++;
			 }
			 if(c>mc)
			 { mc=c;  ch=st.charAt(i);}
		 }
		 System.out.println(ch+" "+mc);
	 }
	 static void characterFrequency()
	 {
		 String st="Count frequency character of a string ";
		 char arr[]=st.toCharArray();
		 int c;
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i=i+c)
		 {
			 c=0;
			 for(int j=i;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 c++;
			 }
			 System.out.println(arr[i]+" "+c);
		 }
	 }
	 static void nonRepeatingCharacter()
	 {
		 String st="abcadce";
		 int c;
		 char arr[]=st.toCharArray();
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i=i+c)
		 {
			 c=0;
			 for(int j=i;j<st.length();j++)
			 {
				 if(arr[i]==arr[j])
					 c++;
			 }
			 if(c==1)
				 System.out.print(arr[i]);
		 }
	 }
	 static void checkAnagram()
	 {
		 String s1="apple";
		 String s2="ppale";
		 char []st1=s1.toCharArray();
		 char []st2=s2.toCharArray();
		 Arrays.sort(st1);
		 Arrays.sort(st2);
		 int n=st1.length;
		 int count=0;
//		 boolean status=Arrays.equals(st1, st2);
//		 if(status==true)
//			 System.out.println("anagram");
//		 else System.out.println("not anagram");
		 for(int i=0;i<n;i++)
		 {
			if(st1[i]==st2[i]) 
				count++;
		 }
		 if(count==n)
			 System.out.println("Anagram word");
		 else System.out.println("Not Anagram word");
	 }
	 static void replaceWord(double d)
	 {
		 d=d-2.0d;
		 System.out.println(d);
		 String st="Replace a word particular word";
		 String str=st.replaceAll("word","");
		 System.out.println(str);
	 }
	static void KthMaxAndMinElements()
	{
		int arr[]= {2,6,4,1,8,3,7,5,1,9,5};
		int k=3;
		int max;
		for(int i=0;i<arr.length-k;i++)
		{
			max=arr[i];
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
	}
	static void moveNegativeElement()
	{
		int arr[]= {5,-8,-4,2,-1,7,-6};
		Arrays.sort(arr);
		for(int x:arr)
			System.out.print(x+" " );
	}
	
	public static void main(String[] args) {
		//checkVowels(); //checkAlphabat();	//findASCII();	//findLength();	//toggleCharacter();
		//countVowels(); //removeVowels();	//removeVowel();	//checkPalindrom();	//checkPalin();
		//reverseString();	//reverseString2();	//removeSpecial();	//removeSpace();	//subString();
		getEqualsString();//removeBracket(); //removeBracket2();//countCharacter();	//countNumber();
		//capitalizeCharacter(); //getMaxCharacter();
		//characterFrequency();
		//nonRepeatingCharacter();
		//double d=12.3;//checkAnagram();
		//replaceWord(d);
		//KthMaxAndMinElements();
		//moveNegativeElement();
	}

}
