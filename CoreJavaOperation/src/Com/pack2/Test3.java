package Com.pack2;

class Test3 {
	 public static void main(String[] args) 
	 {
		int[]x=new int[4];
		x[0]=10;
		test1(x);
		
		System.out.println(x[0]);
		test2(x[0]);
		System.out.println(x[0]);
	}
	 static void test1(int y[])
	 {
		 y[0]=30;
	 }
	 static void test2(int z)
	 {
		 System.out.println(z);
		 z=30;
	 }

}

