class method3
{
	public static void sita()
	{
		System.out.println("hi....!From sita()");
	}
	public static void ram()
	{
		System.out.println("RAM BEGINS");
		sita();
		System.out.println("RAM ENDS");
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN BEGINS");
		ram();
		sita();
		System.out.println("MAIN ENDS");
	}
}
