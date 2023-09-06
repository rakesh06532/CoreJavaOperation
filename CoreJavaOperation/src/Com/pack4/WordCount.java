package Com.pack4;

public class WordCount {
	public void Count(String s)
	{
		int c=0;
		char arr[]=new char[s.length()];
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
			
			if(((i>0 && arr[i]!=' ')&&(arr[i-1]==' '))||(arr[0]!=' ')&&(i==0))
				c++;
			
		}
		System.out.println(c);

	}
	
	public static void main(String[] args) {
		WordCount obj=new WordCount();
		obj.Count("   Hi how are you i am    fine what about you   ");
	   
	}

}
