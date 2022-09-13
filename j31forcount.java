package java1;

import java.util.Scanner;

public class j31forcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a= sc.nextInt();
		System.out.println("enter division");
		int b= sc.nextInt();
		int sum=0,n=0,count=0;
		for(int i=1;n<a;i++)
		{
			n=b*i;
			sum=sum+n;
			count++;
			System.out.print(n+" ");
		}
		System.out.print("count is => "+count);
		System.out.println("sum is => "+sum);
		
	}

}
