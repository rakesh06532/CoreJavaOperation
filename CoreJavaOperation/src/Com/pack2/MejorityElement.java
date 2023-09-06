package Com.pack2;

import java.util.Scanner;
public class MejorityElement {
	public void meth(int a[])
	{
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
				}//if
			}//inner for loop
			if(c>mc)
			{
				mc=c;
				index=i;
			}
		}//outer loop
		if(mc>a.length/2)
			System.out.println("Mejority Element = "+a[index]);
		else
			System.out.println("No Mejority Element found ");
	}//find majority
	public static void main(String[] args) {
		
		MejorityElement obj=new MejorityElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element : ");
		//int noe=Integer.parseInt(sc.nextLine());
		int array[]= {10,2,1,2,3,2,2};
		obj.meth(array);
		sc.close();
		
	}
}
