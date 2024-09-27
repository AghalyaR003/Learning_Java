import java.util.*;
class firstandlastsum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		int last=number%10;

		if (number>9)
		{
			while (number>9)
			{
				number=number/10;
			}
			System.out.println("the sum of first and last digits:"+(number+last));
		}
		else
		{
			System.out.println("invalid");
		}
	}
}


//to add first and last digits of the given number

//enter the number:262819
//total sum:11



