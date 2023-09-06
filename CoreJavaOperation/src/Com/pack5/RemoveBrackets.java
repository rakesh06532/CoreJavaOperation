package Com.pack5;

public class RemoveBrackets {
	public void bracketRemove(String st)
	{
		for(int i=0;i<st.length();i++)
		{
			if(!(st.charAt(i)=='(' || st.charAt(i)==')'))
				System.out.print(st.charAt(i));
		}
	}
	public void countNumber(String st)
	{
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='0' && st.charAt(i)<=57)
				sum=sum+Character.getNumericValue(st.charAt(i));
		}
		System.out.println(sum);
	}
	public void capitalizeEachWord(String st)
	{
//		for(int i=0;i<st.length();i++)
//		{
//			if(i>0 &&(st.charAt(i)!=' ')&&(st.charAt(i+1)!=' '))
//		}

	}
	public void digitSum(int num)
	{
		int rem,sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
	public void factorNumber(int num)
	{
		String sum="";
		for(int i=1;i<=num;i++)
		{
				if(num%i==0) 
					sum=sum+i+" ";
						
		}
		System.out.println(sum);
	}
	public void primeFactor(int num)
	{
		String sum="";//int c;
		for(int i=3;i<=num;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
				c++;
			}
			if(c==2)
				sum=sum+i+" ";
		}
		System.out.println(sum);
	}
	public void strongNumber(int num)
	{
		if(getDigit(num))
			System.out.println(num+" Strong number");
		else
			System.out.println(num+" Not strong number");
	}
	public boolean getDigit(int num)
	{
		int sum=0,rem,temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+fact(rem);
			temp=temp/10;
		}
		if(sum==num)
			return true;
		else return false;
	}
	static int fact(int rem)
	{
		int digit=1;
		for(int i=1;i<=rem;i++)
		{
			digit=digit*i;
		}
		return digit;
	}
	public void perfectNumber(int num)
	{
		if(divisorNumber(num))
			System.out.println(num+" Perfect number");
		else System.out.println(num+" Not perfect number");
	}
	public boolean divisorNumber(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
			return true;
		else return false;
	}
	public void perfactSquare(int num)
	{
		if(num>=0)
		{
			int sr=(int)Math.sqrt(num);
			
			if((sr*sr)==num)
				System.out.println(num+" Perfact square");
			else
				System.out.println(num+" Not perfact square");
		}
	}
	public void getHCF(int num1,int num2)
	{
		int hcf=0;
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
				
			}
			
		}
		System.out.println(hcf);
	}
	public void getLCM(int num1, int num2)
	{
		int hcf=0,LCM;
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
				hcf=i;
		}
		LCM=(num1*num2)/hcf;
		System.out.println("LCM of "+num1+" and "+num2+" is : "+LCM);
	}
	public void convertBinaryToDecimal(int num)
	{
		int rem,decimal=0,n=0;
		while(num>0)
		{
			rem=num%10;
			decimal+=rem*Math.pow(2, n);
			num=num/10;
			n++;
			
		}
		System.out.println(decimal);
	}
	public static void main(String[] args) {
		RemoveBrackets obj=new RemoveBrackets();
		//obj.bracketRemove("kj(kll))jhdj4444445)");
		//obj.countNumber("88je89kkeja");
		//obj.capitalizeEachWord("capitalize each word in a sentance");
		//obj.digitSum(5846);
		//obj.digitSum(5263);
		//obj.factorNumber(12);
		//obj.primeFactor(25);
		//obj.strongNumber(145);
		//obj.perfectNumber(8128);
		//obj.perfactSquare(100);
		//obj.getHCF(36,60);
		//obj.getLCM(12, 20);
		obj.convertBinaryToDecimal(1101011);
	}

}
