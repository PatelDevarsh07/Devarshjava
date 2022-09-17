package java1;

import java.util.Scanner;

public class j73stringchar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("enter the name");
		name=sc.next();
		int x=name.length();
		char ch;
		for(int i=0;i<x;i++)
		{
			ch=name.charAt(i);
			System.out.println(ch);
		}
		

	}

}
