package Pack2;

public class SquareOfSum {
	public void Sum(int a)
	{
		int square=0;
		for(int i=1;i<=10;i++)
		{
			square=square+i*i;
			
		}
		System.out.println("The square of row picture is : "+square);
	}
	public static void main(String[] args) {
		SquareOfSum obj=new SquareOfSum();
		obj.Sum(10);
	}

}
