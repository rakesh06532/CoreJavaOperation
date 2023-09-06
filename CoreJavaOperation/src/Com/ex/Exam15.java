package Com.ex;

public class Exam15 {
	public void Switch(int day)
	{
	switch(day){
	
	      // System.out.println("Week day is :");
	default: System.out.println("Invalid Entry");
	case 0:  System.out.println("Sunday");
	}
	}
	public static void main(String[] args) {
		Exam15 abc=new Exam15();
		abc.Switch(10);
	}
}

