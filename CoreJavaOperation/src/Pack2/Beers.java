package Pack2;

import java.util.Scanner;

public class Beers {
	public boolean beerParty( int beers,boolean weekend)
	{
		 if(weekend==true)
		{
			if(beers>60)return true;
		}
		else if(weekend==false)
		{
			if(beers>=40 && beers<=60)return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		Beers obj=new Beers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of beers ");
		int beers=sc.nextInt();
		System.out.println("Enter weekend or not ");
		boolean weekend=sc.nextBoolean();
		boolean result=obj.beerParty(beers,weekend);
		System.out.println(result);
		sc.close();
	}

}
