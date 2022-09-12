package java1;

import java.util.Scanner;

public class j22ifstringxerox {

	public static void main(String[] args) {
		System.out.println("print for Printing");
		System.out.println("text for Texting");
		System.out.println("both for Printing & Texting");
		System.out.println("What u wanna do: ");
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		x=x.toLowerCase();
		
		if(x.equals("print"))
		{
			System.out.println("How many pages u wanna print: ");
			int quantity=sc.nextInt();
			if(quantity<=20)
			{
				int a=quantity*20;
				System.out.println("ur bill is: "+a);
			}
			if(quantity>=20)
			{
				int a=quantity*15;
				System.out.println("ur bill is: "+a);
			}
		}
		else if(x.equals("text"))
		{
			System.out.println("How many pages u wanna text: ");
			int quantity=sc.nextInt();
			if(quantity<=20)
			{
				int a=quantity*15;
				System.out.println("ur bill is: "+a);
			}
			if(quantity>=20)
			{
				int a=quantity*10;
				System.out.println("ur bill is: "+a);
			}
		}
		else if(x.equals("both"))
		{
			System.out.println("How many pages u wanna print & text: ");
			System.out.println("How many pages u wanna print: ");
			int c=0,d=0;
			int pquantity=sc.nextInt();
			if(pquantity<=20)
			{
			    c=pquantity*20;
				System.out.println("ur bill is: "+c);
			}
			if(pquantity>=20)
			{
			    c=pquantity*15;
				System.out.println("ur bill is: "+c);
			}
			
			System.out.println("How many pages u wanna text: ");
			int tquantity=sc.nextInt();
			if(tquantity<=20)
			{
			    d=tquantity*20;
				System.out.println("ur bill is: "+d);
			}
			if(tquantity>=20)
			{
			    d=pquantity*15;
				System.out.println("ur bill is: "+d);
			}
			int total;
			total=c+d;
			System.out.println("ur total bill is: "+total);
		}


	}

}
