package Pack2;



public class GCD2 {
	int i=1,last;
	public int Number(int a, int b)
	{
		if(i<=a && i<=b)
		{
		if(a%i==0 && b%i==0) last=i;
		i++;
		Number(a,b);
		}
		return last;
	}
	public static void main(String[] args) {
		GCD2 obj=new GCD2();
		int result= obj.Number(36, 60);
		System.out.println(result);
	}

}
