import java.util.Scanner;
class secondlargest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		System.out.println("enter the a");
		int a=sc.nextInt();
		System.out.println("enter the b");	
		int b=sc.nextInt();
		System.out.println("enter the c");				
		int c=sc.nextInt();
								
		if(a>b && a>c) //a is 1 largest 
	     {
			 if(b>c)
				 {
					System.out.println(b+": is second largest number");
				}
			else{
              	System.out.println(c+": is second largest number");
											
					}
					}
		else if (b>c)
					{
			if (a>c)
			{        
				System.out.println(a+": is second largest number");

			}
			else{  
				System.out.println(c+": is second largest number");

			}
					}
			else
						{
						{if (a>b)
						{          
				            System.out.println(a+": is second largest number");

						}
						  	System.out.println(b+": is second largest number");

						}
					}
										



	
}
}
