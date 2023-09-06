package pack3;

public class Number {
	public boolean meth(String s)
	{
		boolean st=true;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			{	st= false;
			    break;
			}
			else st= true;
		}
		return st;
	}
	public static void main(String[] args) {
		Number obj=new Number();
		boolean res=obj.meth("123456");
		System.out.println(res);
	}

}
