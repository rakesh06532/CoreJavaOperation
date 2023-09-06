package pack3;

import java.util.Arrays;


public class WordReverse {
	public String Word(String s)
	{
		String st="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
			//System.out.println(s.charAt(i));
		}
		return s+"|"+st;
	}
	public String arrange(String s)
	{
		char c[]=s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		return "";
	}
	public static void main(String[] args) {
		WordReverse obj=new WordReverse();
		String s="EARTH";
		String res=obj.Word(s);
		System.out.println(res);
		obj.arrange(res);
		
	}

}
