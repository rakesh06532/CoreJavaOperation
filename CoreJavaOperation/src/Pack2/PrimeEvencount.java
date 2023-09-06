package Pack2;

public class PrimeEvencount {
	public void Count(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
		if(i%2==0)count++;
		}
		PrimeEvencount obj2=new PrimeEvencount();
		System.out.println(("The total no of even and prime cards collected ")+(count+obj2.Prime(a)));
	}
	public int Prime(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			int count2=0,count3=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)count2++;
			}
			if(count2==2)count3++;
			sum=sum+count3;
		}
		return sum;
	}
	public static void main(String[] args) {
		PrimeEvencount obj=new PrimeEvencount();
		obj.Count(100);
	}

}
