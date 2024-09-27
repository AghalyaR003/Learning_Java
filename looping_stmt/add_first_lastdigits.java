//to add first and last digits of the given number

//enter the number:262819
//total sum:11


import java.util.*;
class  add_first_lastdigits
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the number:");
		int number=sc.nextInt();
		int last=number%10;
		while (number>9)
		{
			number=number/10;
		}
		System.out.println("total sum:"+(number+last));
	}
}
