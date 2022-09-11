package java1;

import java.util.Scanner;

public class j20ifsquarecube {

	public static void main(String[] args) {
		System.out.println("1] Square");
		System.out.println("2] Cube");
		System.out.println("Enter ur choice: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1)
		{
			System.out.println("Enter number=> ");
			int a=sc.nextInt();
			int s=a*a;
			System.out.println("Square of given number=> "+s);
		}
		else if(x==2)
		{
			System.out.println("Enter number=> ");
			int b=sc.nextInt();
			int c=b*b*b;
			System.out.println("Cube of given number=> "+c);
		}
	}

}
