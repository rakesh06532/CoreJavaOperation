package pack3;

public class ReverseWord {
	public void meth(String s)
	{
		String str[]=s.split("");
		System.out.print("The reverse word of "+s+" is : "); 
		for(int i=str.length-1;i>=0;i--)
		
			System.out.print(str[i]);
		System.out.println();
	}
	public void meth2(String s)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		StringBuffer sb2=sb.reverse();
		System.out.println(sb2);
		}
	public static void main(String[] args) {
		ReverseWord rw=new ReverseWord();
		rw.meth("'"+"World is Beautiful"+"'");
		rw.meth2("World is Beautiful");
	}

}
