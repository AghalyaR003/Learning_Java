class swapwithouttemp 
{
	public static void main(String[] args) 
	{
		int a=10,b=30;
		System.out.println("before swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
