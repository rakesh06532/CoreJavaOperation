package Pack2;

public class DanceCompetition {
	
	public void Dance(int a)
	{
		for(int i=2;i<10;i++)
		{
			if(i%2==0) 
				System.out.print("("+"b"+i+",");
			else 
				System.out.println("g"+i+")");
		}
		
	}
	public static void main(String[] args) {
		DanceCompetition obj=new DanceCompetition();
		obj.Dance(10);
	}

}
