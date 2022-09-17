package java1;

import java.util.Scanner;

public class j76stringupperlower {

	public static void main(String[] args) {
		int u=0,l=0;
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("enter the name");		
		name=sc.nextLine();
		int x=name.length();
		char ch;		
		for(int i=0;i<x;i++)
		{
			ch=name.charAt(i);
			System.out.println(ch);
			
			if(ch>='A'&&ch<='Z')
			{
				u++;
			}
			else if(ch>='a'&&ch<='z')
			{
				l++;
			}
		}
			System.out.println("upper case is/are=> "+u);
			System.out.println("lower case is/are=> "+l);

	}

}
