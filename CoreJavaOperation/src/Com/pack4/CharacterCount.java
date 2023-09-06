package Com.pack4;

import java.util.Arrays;

public class CharacterCount {
	public void Character()
	{
		int count,i;
		String s="Java is awesome";
		String s1=s.replace(" ", "");
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		for( i=0;i<c.length;)
		{
			count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j])
					count++;
			}
			System.out.println(c[i]+" "+count);
			i=i+count;
			
		}
		
	}
	static void getVowelsCharacter()
	{
		String st="Rakesh";
		String str=st.toUpperCase();
		for(int i=0;i<st.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
				System.out.print(str.charAt(i));
		}
	}
	static void getPrimeNumber()
	{
		int num=15,flag=0;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
				flag=1;
		}
		if(flag==1)
			System.out.println("Not prime number");
		else
			System.out.println("Prime Number"); 
	}
	static void pattern()
	{
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	}
	static void addTwoNumber()
	{
		int num1=15;int num2=25;
		for(int i=1;i<=num1;i++)
		{
			num2++;
		}
		System.out.println(num2);
	}
	static void munltiplyTwoNumber()
	{
		int num1=8,num2=10,sum=0;
		for(int i=1;i<=num1;i++)
		{
			sum=sum+num2;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//CharacterCount obj=new CharacterCount();
		//obj.Character();
		//getPrimeNumber();
		//pattern();
		//addTwoNumber();
		munltiplyTwoNumber();
	}

}
