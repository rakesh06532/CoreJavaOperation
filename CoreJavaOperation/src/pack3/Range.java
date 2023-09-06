package pack3;


public class Range {
	public void RangeCount(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
			}
	}
		System.out.println(a[a.length-1]);
		System.out.println("Diffrence between smallest and largest number is : "+(a[a.length-1]-a[0]));
	}
	public static void main(String[] args) {
		Range obj=new Range();
		int a[]= {2,4000,1,3,500};
		obj.RangeCount(a);
	}

}
