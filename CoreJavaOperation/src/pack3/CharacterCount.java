package pack3;

import java.util.Arrays;
public class CharacterCount {
	public void CountFrequence(String s)
	{
		int count;
		char c[]=s.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i=i+count)
		{
			count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j])
				
					count++;
				
			}
			System.out.print(c[i]+" "+count+",");
		//	i=i+count;
		}
		
	}
	public void countCharacter(String s)
	{
		int count=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
	public void countVowels(String st)
	
	{
		int flag=0;
		char ch[]={'a','e','i','o','u','A','E','I','O','U'};
		char arr[]=st.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
			if(arr[i]==ch[j])
			  {
			    flag=1;
			    break;
			  }
			}
		}
		if(flag==0)
			System.out.println(false);
		else
			System.out.println(true);
	}
	public void containsVowles(String st)
	{
		int result=0,c;
		char ch[]= {'a','e','i','o','u'};
		char str[]=st.toCharArray();
		Arrays.sort(str);
		
		for(int i=0;i<str.length;i++)
		{
			c=0;
			for(int j=0;j<ch.length;j++)
			{
				if(str[i]==ch[j])
					c++;
			}
			result=result+c;
		}
		System.out.println(result);
		
	}
	public void word(String st)
	{
		int count=0;
		char ch[]=st.toCharArray();
		for(char c:ch)
		{
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			//break;
			//default :
		}
		}
		System.out.println(count);
	}
	public String[] checkWord(String []arr)
	{
		String p[]=new String [arr.length];
		int j,i;
	
		
		for(j=0;j<arr.length;j++)
		{
			int c1=0;
			char ch[]=arr[j].toCharArray();
			for(i=0;i<ch.length;i++)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					c1++;
			}
			if(c1!=0)
			{
				int c2=0;
				p[j]=arr[j];
				c2++;
			}
		}
		return p;
	}
	public void meth()
	{
		StringBuffer sb1=new StringBuffer("Rakesh");
		StringBuffer sb2=new StringBuffer("Rakesh");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		StringBuilder s=new StringBuilder("Aryan");
		StringBuilder s2=new StringBuilder("Aryan");
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		s=new StringBuilder("kumar");
		System.out.println(s);
		final StringBuffer sb3=new StringBuffer("Rakesh");
		//sb3=new StringBuffer("kumar");
		System.out.println(sb3);
	}
	public static void main(String[] args) {
		CharacterCount obj=new CharacterCount();
		//String st="klklkA";
		//obj.CountFrequence(st);
		//obj.countCharacter(st);
		//obj.countVowels(st);
		String arr[]= {"rakesh","Raju","fls","Aryan","klkl","Prince"};
		String []P=obj.checkWord(arr);
		for(int j=0;j<arr.length;j++)
		{
			if(P[j]!=null)
			{
				System.out.println(P[j]);
			}
		}
		//String st="How many vowels characters in this String ";
		//String str=st.toLowerCase();
		//obj.containsVowles(str);
		//obj.word(str);
		obj.meth();
	}

}
