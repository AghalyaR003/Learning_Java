class method1 
{
	public static void msg1()
	{
		System.out.println("GOOD MORNING");
		msg2();
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN START");
		msg1();
		System.out.println("MAIN END");
	}
	public static void msg2()
	{
		System.out.println("GOOD AFTERNOON");
		msg3();
	}
	public static void msg3()
	{
		System.out.println("GOOD NIGHT");
	}
}
