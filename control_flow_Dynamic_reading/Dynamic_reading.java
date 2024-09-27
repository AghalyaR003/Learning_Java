import java.util.Scanner;
class Dynamic_reading 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Student detials");
		System.out.println("enter stdid");
		int a=sc.nextInt();                 //integer value
		System.out.println("enter stdName");
		char b=sc.next().charAt(1);         //character value
		System.out.println("enter phno");
		long c=sc.nextLong();               // large no of value
		System.out.println("enter marks");
		double d=sc.nextDouble();           // decimal value
		System.out.println("enter std status");
		boolean e=sc.nextBoolean();            // boolean value true or false
		System.out.println("enter comments");
		String f=sc.nextLine();               //string value
		System.out.println("stdid:"+a);
		System.out.println("first letter:"+b);
		System.out.println("std phno:"+c);
		System.out.println("std marks:"+d);
		System.out.println("std status pass or fail:"+e);
		System.out.println("comments:"+e);
		
	}
}
