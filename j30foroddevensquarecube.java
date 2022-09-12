package java1;

import java.util.Scanner;

public class j30foroddevensquarecube {

	public static void main(String[] args) {
		int sq=0,cb=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a= sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
			sq=(i*i);
			sum=sum+sq;
			System.out.print(sq+"+");
			}
			else
			{
			cb=(i*i*i);
			sum=sum+cb;
			System.out.print(cb+"+");
			}
			
		}
		System.out.println("=>"+sum);

	}

}
