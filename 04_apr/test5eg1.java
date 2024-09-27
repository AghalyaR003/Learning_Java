import java.util.Scanner;
class test5eg1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
		System.out.println(number+"x"+i+"="+(number*i));
		}
	}
}
