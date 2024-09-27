import java.util.*;
class sum_list 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;
		String list=" ";
		int sum=0;
		do
		{
			System.out.print("enter the number:");
			int number=sc.nextInt();
			sum+=number;
			list+=number; //list+number 
			System.out.print("do you want to continues(y/n);");
			char ch=sc.next().charAt(0);
			if (ch=='n' || ch=='N')
			{
				flag=false;
			}
		}
		while (flag);
		System.out.print("sum of list:"+list);
		System.out.print("sum of the number:"+sum );
	}
}
