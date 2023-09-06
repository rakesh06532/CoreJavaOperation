package pack3;


public class CharacterCheck {
	
	public String word2(String str[])
	{
		String s1=str[0].substring(0,2);
		String s2=str[1].substring(0,2);
		String s3=str[2].substring(0,2);
		if(s1.equals(s2)&&s1.equals(s3))
		
		return s1;
		else
			return "\""+"\"";
			
	}
	public static void main(String[] args) {
		CharacterCheck obj=new CharacterCheck();
		String str[]= {"flowers","fly","flag"};
		String s=obj.word2(str);
		System.out.println(s);
		
	}

}
