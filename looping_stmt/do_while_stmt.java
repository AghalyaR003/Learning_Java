import java.util.*;
class do_while_stmt 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		int n=sc.nextInt();
		int count=1;
		do
		{
			System.out.println("aghal");
			count++;
		}
		while (count<=n);
	}
}
