package Pack2;

public class GCD {
	public int Number(int a, int b)
	{
		if(b!=0)
		return Number(b,a%b);
		else return a;
	}
	public static void main(String[] args) {
		GCD obj=new GCD();
		int result=obj.Number(48,60);
		System.out.println(result);
	}

}

 