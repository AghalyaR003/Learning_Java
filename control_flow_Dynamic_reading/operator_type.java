import java.util.*;
class operator_type // 1)Arithmatic operator ->1) additional (+) 2) subtraction(-) 3)multiplication(*) 4)division(/) 5)modules (%)
{
	public static void main(String[] args) 
	{
		System.out.println("integer");
		int a=10,b=20;
		int res=a+b;
		System.out.println("Arithmatic operator:"+res);
		int res1=a-b;
		System.out.println("subtraction operator:"+res1);
		int res2=a*b;
		System.out.println("multiplication operator:"+res2);
		int res3=a/b;
		System.out.println("division operator:"+res3);
		int res4=a%b;
		System.out.println("modules operator:"+res4);

	}
}
