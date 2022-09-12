package java1;

import java.util.Scanner;

public class j29forsumofsquare {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get sum of square");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			int n=i*i;
			sum=sum+n;
		}
		System.out.println("sum => "+sum);

	}

}
