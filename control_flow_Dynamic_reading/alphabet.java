import java.util.Scanner;
class  aiphabet
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z'){
			System.out.println(ch+":is uppercase");

		}
		else if(ch>='a' && ch<='z'){
			System.out.println(ch+":is lowercase");

		}
		else if(ch>='o' && ch<='9'){
			System.out.println(ch+":is special character");

		}
	}
}


//write a program to check whether a charcater is alphabet or not