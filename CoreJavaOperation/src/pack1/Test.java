package pack1;

public class Test {
	int[] meth1(int arr[])
	{
	
    System.out.println("meth1 called ");
    return arr;
	}
	int[] meth2()
	{
		System.out.println("meth2 called ");
		int arr[]= {3,2,3};
		for(int i=0;i<3;i++)
		{
			if((arr[i]==2) && (arr[i+1]==3))
			arr[i+1]=0;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		Test obj=new Test();
//		int arr[]= {10,20,30,40};
//		obj.meth1(arr);
//		int result[]=arr;
//		for(int x:result)
//		System.out.println(x);
		int result[]=obj.meth2();
		for(int x:result)
		System.out.println(x);
	}
}



