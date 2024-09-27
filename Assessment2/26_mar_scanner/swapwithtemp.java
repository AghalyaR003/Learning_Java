class swapwithtemp 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("before swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
