import java.util.*;
class s1 
{
	public static void main(String[] args) 
	{
		String str="azAZcNbM";
		//convert to char[]
		char[] ch=str.toCharArray();
		//sort char[]
		Arrays.sort(ch);
		String uc="",lc="";
		//traverse sorted array to extract UC and LC seperatly
		for (int i=0;i<ch.length ;i++ )
		{
			if(ch[i]>='A' && ch[i]<='Z')
				uc+=ch[i];
			else if(ch[i]>='a' && ch[i]<='z')
				lc+=ch[i];

		}
		String ans="";
		for (int i=0,m=0,n=0;i<str.length() ;i++ )
		{
			if (str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				ans+=uc.charAt(m++);
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ans+=lc.charAt(n++);
			}
			System.out.println("input:"+str);
			System.out.println("output:"+ans);
		}
	}
}
