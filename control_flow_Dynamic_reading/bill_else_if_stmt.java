import java.util.*;
class bill_else_if_stmt

{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the units:");
		int unit=sc.nextInt();
		float amount=0f;
		if(unit<=50 && unit>0)
			amount=unit*0.50f;
		else if(unit<=150)
			amount=unit*0.75f;
		else if(unit<=250)
			amount=unit*1.20f;
		else if(unit>250)
			amount=unit*1.50f;
		float tax=amount*0.2f;
		float total_amount=amount+tax;
		System.out.println("total electricity bill:"+unit);
		System.out.println("total amount:"+total_amount);
		System.out.println("total tax:"+tax);

	}
}
