package pack3;

public class ReverseString {
	public String getImage(String a)
	{
		String str="";
		for(int i=a.length()-1;i>=0;i--)
		{
	        str=str+a.charAt(i);
		}
		return a+"|"+str;
	}
	public String meth1(String b)
	{
		String s="";
		StringBuilder st=new StringBuilder();
		st.append(b);
		StringBuilder c=st.reverse();
		 s=s+c;
		 return b+"|"+s;
	}
	
	public static void main(String[] args) {
		ReverseString obj=new ReverseString();
		String result=obj.getImage("EARTH");
		System.out.println("After reverse the string : "+result);
		String result2=obj.meth1("EARTH");
		System.out.println("After reverse the string : "+result2);
	}

}
