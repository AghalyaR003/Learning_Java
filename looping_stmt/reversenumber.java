import java.util.*;
class reversenumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the number:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
