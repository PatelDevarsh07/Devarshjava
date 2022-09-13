package java1;

import java.util.Scanner;

public class j33forprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a= sc.nextInt();
		int c=0;
		for(int i=2;i<a/2;i++)
		{
		if(a%i==0)
		{
			c=200;
			break;
		}
		}
		if(c==0) {
       System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");	
		}

	}

}
