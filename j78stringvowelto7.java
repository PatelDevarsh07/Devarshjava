package java1;

import java.util.Scanner;

public class j78stringvowelto7 {

	public static void main(String[] args) {
		    int c=0,v=0;
			Scanner sc= new Scanner(System.in);
			String name;
			String s=" ";
			System.out.println("enter the name");		
			name=sc.nextLine();
			int x=name.length();
			char ch;		
			for(int i=0;i<x;i++)
			{
				ch=name.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					s+="7";					
				}
				else
				{
					s+=ch;
				}
			}
			    System.out.println(" "+s);
				
	}
}
