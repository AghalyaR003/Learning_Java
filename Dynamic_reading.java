import java.util.Scanner;
class Dynamic_reading 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Student detials");
		System.out.println("enter stdid");
		int a=sc.nextInt();
		System.out.println("enter stdName");
		char b=sc.next().charAt(1);
		System.out.println("enter phno");
		long c=sc.nextLong();
		System.out.println("enter marks");
		double d=sc.nextDouble();
		System.out.println("enter std status");
		boolean e=sc.nextBoolean();
		System.out.println("enter comments");
		String f=sc.nextLine();
		System.out.println("stdid:"+a);
		System.out.println("first letter:"+b);
		System.out.println("std phno:"+c);
		System.out.println("std marks:"+d);
		System.out.println("std status pass or fail:"+e);
		System.out.println("comments:"+e);
		
	}
}
