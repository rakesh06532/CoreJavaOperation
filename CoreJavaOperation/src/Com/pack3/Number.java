package Com.pack3;



public class Number {	
	
	public void meth()
	{
		try {
		String s="java-codes";
		byte b=Byte.parseByte(s);
		
		System.out.println(b);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception ");
		}
	}
	public static void main(String[] args) {
		
		Number obj=new Number();
	
		obj.meth();
		
		
		
		
	}

}
