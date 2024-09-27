import java.util.*;
class do_1max_1min 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		boolean flag=true;
		int sum=0;
		String list=" ";
		do
		{
			System.out.println("enter the number:");
			int number=sc.nextInt();
			if (number>max)
			{
				max=number;
			}
			if (number<min)
			{
				min=number;
			}
			sum+=number;
			list+=number;
	    	System.out.println("do you want to continue:(y/n);");
			char ch=sc.next().charAt(0);
			if (ch=='n' ||ch=='N')
			{
				flag=false;
			}

		}
		while (flag);
		System.out.println("sum of number:"+sum);
		System.out.println("sum of the list:"+list);
		System.out.println("1st maximum number:"+max);
		System.out.println("1st mimimum number:"+min);


	}
}


//wajpt read integer until user stop and finally print 
// 1st max and 1st min or smallest number