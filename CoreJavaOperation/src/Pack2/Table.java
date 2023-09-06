package Pack2;

public class Table {
	int arr2[]= {0,1,2,3};
	public void meth1()
	{
		int arr[]= {10,20};
		System.out.println("Array Length : "+arr.length);
		System.out.println("Array Length : "+arr2.length);
		System.out.println("----------------------------------");
	}
	public void meth2()
	{
		System.out.println("meth2 called ");
		for(int i=1;i<=arr2.length;i++)
			System.out.println("arr2 length : "+arr2.length);
	}
	public static void main(String[] args) {
		Table a=new Table();
		a.meth1();
		a.meth2();
	}

}
