import java.util.*;
class read_table
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean ans=true;
		do
		{
			System.out.print("enter the values:");
		    int n=sc.nextInt();
  
      		for (int i=1;i<=10 ;i++ )
	     	{
			System.out.println(i+"X"+n+ "="+(i*n));
		    }
			System.out.println("do you want to continue:(y/n);");
			char ch=sc.next().charAt(0);
			if (ch=='n' ||ch=='N')
			{
				ans=false;
			}
		}
		while (ans);
		System.out.println("******************");
		
	}
}

