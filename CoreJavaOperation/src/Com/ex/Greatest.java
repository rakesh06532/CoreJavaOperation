package Com.ex;

public class Greatest {
	
	void meth(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is greatest");
			else System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b+" is greatest");
			else System.out.println(c);
		}
	}


		public static void main(String[] args) {
			Greatest obj=new Greatest();
			obj.meth(10003, 1002, 1100);
}
	}

