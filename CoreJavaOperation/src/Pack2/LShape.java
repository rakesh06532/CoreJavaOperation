package Pack2;

public class LShape {
	public void Shape(int a)
	{
		String st="";
		for(int i=1;i<=a;i++)
		{
			//if(i<=3)st=st+"*"+'\n';
			//else st=st+"* ";
			for(int j=1;j<=a;j++)
			{
				if(j==1||i==a)
					System.out.print(" * ");
			}
			System.out.println("\n");
		}
		System.out.println(st); 
	}
	public static void main(String[] args) {
		LShape obj=new LShape();
		obj.Shape(10);
		
	}

}
