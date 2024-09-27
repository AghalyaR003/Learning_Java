import java.util.Scanner;
class  leap_year
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a year");
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0)
		{
			System.out.println(year+":is a leap year");
		}
		else
		{
			System.out.println(year+":is not a leap year");

		}
	}
}




// any year is divisible by 4 and not divisible by 100 or divisible by 400  ---> leap year