package java1;

import java.util.Scanner;

public class j75stringvowelconsonant {

	public static void main(String[] args) {
	    int c=0,v=0;
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
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
			System.out.println("vowel is/are=> "+v);
			System.out.println("consonant is/are=> "+c);

	}

}
