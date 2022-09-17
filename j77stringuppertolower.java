package java1;

import java.util.Scanner;

public class j77stringuppertolower {

	public static void main(String[] args) {
		int u=0,l=0;
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("enter the name");		
		name=sc.nextLine();
		int x=name.length();
		char ch=0;		
		for(int i=0;i<x;i++)
		{
			ch=name.charAt(i);			
		}	
			if(ch>='A'&&ch<='Z')
			{
				System.out.println(name.toLowerCase());
				u++;
			}
			else if(ch>='a'&&ch<='z')
			{
				l++;
				System.out.println(name.toUpperCase());
			}
	}

}
