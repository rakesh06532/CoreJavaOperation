package Pack2;

public class OuterInner {
	int sum;
	public int Outer(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<=a/2;j++)
			{
				
//				sum2=sum2+j;
			System.out.println(j);
			}
			//System.out.println(i);
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		OuterInner obj=new OuterInner();
		int result=obj.Outer(20);
		System.out.println(result);
	}

}
