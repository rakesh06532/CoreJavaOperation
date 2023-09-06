package Com.pack5;

public class Practice {
	static void getStarHash()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<6;j++)
			{
				if((i+j)%2==0)
					System.out.print(" # ");
				else System.out.print(" * ");
			}
			System.out.println();
		}
	}
	static void sumOfInteger()
	{
		int num=4567;int reminder,sum=0;
		while(num>0)
		{
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		System.out.println(sum);
	}
	static void getStar()
	{
		int a=5,b=5,i,j;
		for( i=1;i<=a;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(j=1;j<=b;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
	}
	static void getTraingle()
	{
		int a=5,b=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				if(i==a || i==j || j==1 )
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void getSlash()
	{
		int a=5,b=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=b;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=b;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void getAngle()
	{
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void getChristmas()
	{
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=1;j--)
			{
				System.out.print(" ");
			}
//			for(int j=1;j<=a;j++)
//			{
//				System.out.print(" *");
//			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//getStarHash();
		//sumOfInteger();
		//getStar();
		//getTraingle();
		//getSlash();
		//getAngle();
		getChristmas();
	}

}
