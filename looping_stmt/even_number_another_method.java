import java.util.*;
class even_number_another_method 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the values:");
		int n=sc.nextInt();
		for (int i=n;i>=2 ;i-=2 )
		{
			System.out.println(i);
		}
	}
}
