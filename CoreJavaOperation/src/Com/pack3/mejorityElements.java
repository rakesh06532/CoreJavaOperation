package Com.pack3;


import java.util.Scanner;

public class mejorityElements {
	
	public void Elements(int a[])

	{
		
		int mc=0;
		int index=-1;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					c++;
				
			}
			if(c>mc)
			{
				mc=c;
				index=i;
			}
		}
		if(mc>a.length/2)
			System.out.println("Mejority elements is : "+a[index]);
		else System.out.println("Mejority elements is not found ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much elements u want to store ");
		
		try {
			int n=Integer.parseInt(sc.nextLine());
			if(n==0)
			{
				System.out.println("Array is emptay we cann't do any operation ");
			}
			else 
			{
				int arr[]=new int [n];
				for(int i=0;i<n;i++)
				{
					System.out.print("Enter "+(i+1)+" value ");
					arr[i]=Integer.parseInt(sc.nextLine());
				}
				System.out.println("Original Elements is ");
				for(int x:arr)
				{
					System.out.print(x+"  ");
				}
				System.out.println();
				mejorityElements obj=new mejorityElements();
				obj.Elements(arr);
			}
			
		}
		catch(NegativeArraySizeException nae)
		{
			System.out.println("Don't Enter -ve value array size ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Don't Enter String, special symbols ");
		}
		finally {
			sc.close();
		}
		
	}

}
