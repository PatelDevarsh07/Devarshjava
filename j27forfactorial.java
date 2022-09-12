package java1;

import java.util.Scanner;

public class j27forfactorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get factorial");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.print(i+"*");
		}
		System.out.println(" => "+fact);

	}

}
