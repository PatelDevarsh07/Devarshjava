package java1;

import java.util.Scanner;

public class j74stringcountspace {

	public static void main(String[] args) {
		int c=0;
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
		
		if(ch==' ')
		{
			c++;
		}
		}
		System.out.println("space is/are=> "+c);
	}

}
