package java1;

import java.util.Scanner;

public class j82stringsamesame {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name1,name2;
		System.out.println("enter string1");
		name1=sc.nextLine();
		System.out.println("enter string2");
		name2=sc.nextLine();
		int x1=name1.length();
		int x2=name2.length();
		char ch1=0,ch2=0;
		for(int i=0;i<x1;i++)
		{
			ch1=name1.charAt(i);
		}	
		
		for(int i=0;i<x2;i++)
		{
			ch2=name2.charAt(i);						
		}
		
		if(x1==x2)
		{
			if(ch1==ch2)
			{	
			System.out.println("same string");
			}
			else
			{
				System.out.println("not same string");
			}
		}
		else
		{
			System.out.println("not same string");
		}


	}

}
