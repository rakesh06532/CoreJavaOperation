package pack3;

public class Replace {
	 public String meth(String s,char ch)
	{
		 String st=s.replace('J', 'a');
		return st;
	}
	public static void main(String[] args) {
		Replace obj=new Replace();
		String res=obj.meth("Java is awesome",'a');
		System.out.println(res);
		
	}

}
