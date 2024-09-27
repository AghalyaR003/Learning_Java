import java.util.Scanner;
class  gradefinder
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the percentage");
		double per=sc.nextDouble();
		String grade;
		if(per>=0 && per<=100)
		{
	    if(per>=90)
		
			grade="A";
		
		else if(per>=80)
			grade="B";
		else if(per>=70)
			grade="C";
		else if(per>=60)
			grade="D";
		else if(per>=40)
			grade="E";
		else
			grade="F";
		System.out.println("student grade is:"+grade);
		}
		else
			System.out.println("enter valid percentage");
	}
}
