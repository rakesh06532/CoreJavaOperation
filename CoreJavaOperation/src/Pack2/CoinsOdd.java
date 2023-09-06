package Pack2;

public class CoinsOdd {
	public int AddCoins(int a)
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		CoinsOdd obj=new CoinsOdd();
		int result=obj.AddCoins(20);
		System.out.println("Total no of odd Bottles Coins : "+result); 
	}

}
