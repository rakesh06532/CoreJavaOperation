package Pack2;

public class Equilateral {
	public void Traingle(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j==1||i==a)
					System.out.print(" * ");
			}
			System.out.println(" \n");
		}
	}
	public static void main(String[] args) {
		Equilateral obj=new Equilateral();
		obj.Traingle(10);
	}

}
