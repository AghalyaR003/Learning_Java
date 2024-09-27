import java.util.*;
class p7 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the start number:");
		int start=sc.nextInt();
		System.out.println("enter the end number:");
		int end=sc.nextInt();
		while (start<=end)
		{
			System.out.println(start++);
		}



	}
}
