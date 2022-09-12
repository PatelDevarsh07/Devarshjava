package java1;

import java.util.Scanner;

public class j28forsum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get sum");
		int a= sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println("sum is "+sum);

	}

}
