package Com.pack2;

public class Majority {
	public void meth(int a[])
	{
		System.out.print("Original element : ");
		for(int x:a)
			System.out.print(x+" ");
		int mc=0;
		int index=-1;
		
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>mc)
			{
				mc=c;
				index=i;
			}
		}
		System.out.println();
		if(mc>a.length/2)
		{
			System.out.println("Majority Element : "+a[index]);
		}
		else
		{
			System.out.println("No element found"); 
		}
	}
	public static void main(String[] args) {
		Majority obj=new Majority();
		int a[]= {1,2,1,6,1,1};
		obj.meth(a);
	}
}
