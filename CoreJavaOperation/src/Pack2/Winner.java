package Pack2;
import java.util.Scanner;
public class Winner {
	int val;
	public int WinnerCity(String City)
	{
		
//		//if(City=="Delhi") return 1;
//		int val=0;
//		//if(City.equals("Delhi")) val = 10000;
//		if(City=="Delhi") val = 10000;
//		return val;
		if(City.equals("Delhi"))
			val=15000;
		else if (City.equals("Mumbai"))
			val=20000;
		else if (City.equals("Channai"))
			val=10000;
		else if (City.equals("Bangolore"))
			val=25000;
		else if(City.equals("Hyderabad"))
			val=10000;
		else val=0;
		return val;
	}
	public static void main(String[] args) {
		Winner obj=new Winner();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one City from the list ");
		System.out.println("Delhi, Mumbai, Chenai, Hyderabad, Bangalore ");
		String City=sc.nextLine();
		int result=obj.WinnerCity(City);
		System.out.println("The Winner amount is : "+result); 
		sc.close();
	}

}
