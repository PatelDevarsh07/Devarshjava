package java1;

import java.util.Scanner;

public class j21ifxerox {

	public static void main(String[] args) {
		System.out.println("1] Printing");
		System.out.println("2] Texting");
		System.out.println("3] Both ");
		System.out.println("What u wanna do: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1)
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
		else if(x==2)
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
		else if(x==3)
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
