package java1;

import java.util.Scanner;

public class j16ifcalci {

	public static void main(String[] args) {
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("enter ur option");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		if(x==1)
		{
			System.out.println("Addition"+(a+b));
		}
		else if(x==2)
		{
			System.out.println("Subtraction"+(a-b));
		}
		else if(x==3)
		{
			System.out.println("Multiplication"+(a*b));
		}
		else if(x==4)
		{
			System.out.println("Division"+(a/b));
		}
		
		
		

	}

}
