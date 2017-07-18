package ceaser;

import java.util.Scanner;
public class CeaserCyph 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:- ");
		String plaintext=sc.nextLine();
		System.out.println("Enter Key :- ");
		int k;
		k=sc.nextInt();
		char ceaserc[]=plaintext.toCharArray();
		System.out.println();
		
		for(int i=0;i<plaintext.length();i++)
			if(ceaserc[i]!=' ')
			{
				int a1 = (int)ceaserc[i]+k;
				if(a1>122)
					a1=a1-26;
				ceaserc[i]=(char)a1;
			}
			else
				ceaserc[i]=ceaserc[i];
		for(int i=0;i<plaintext.length();i++)
		    System.out.print(ceaserc[i]);
	}
}
