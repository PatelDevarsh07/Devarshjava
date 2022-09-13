package java1;

import java.util.Scanner;

public class j32foraddsub {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a= sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				sum=sum-i;
				System.out.print(" - "+i);
			}
			else
			{
				sum=sum+i;
				System.out.print(" + "+i);
			}
		}
		System.out.print("=>"+sum);

	}

}
