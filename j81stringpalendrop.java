package java1;

import java.util.Scanner;

public class j81stringpalendrop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("enter the name");
		name=sc.nextLine();
		int x=name.length();
		char ch1=0,ch2=0;
		for(int i=0;i<x;i++)
		{
			ch1=name.charAt(i);
			System.out.println(ch1);			
		}
		for(int i=x-1;i>=0;i--)
		{
			ch2=name.charAt(i);
			System.out.println(ch2);			
		}
		if(ch1==ch2)
		{
			System.out.println("it is palendrop");
		}

	}

}
