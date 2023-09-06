package Com.ex;

public class Check {
	void meth1 (int a)
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Retereving array data from for loop : ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Retereving data from for-each loop");
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		Check obj=new Check();
		obj.meth1(5);
	}

}
