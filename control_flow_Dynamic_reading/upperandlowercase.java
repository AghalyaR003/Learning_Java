import java.util.Scanner;
class upperandlowercase 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			{
			System.out.println(ch+":is uppercase");
				
			}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+":is lowercase");
		}
		else{
             System.out.println("enter the valid character");
		}

	}
}

//write a program to check whether a character is uppercase or lowercase alphabet
 