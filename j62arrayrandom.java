package java1;

import java.util.Random;
import java.util.Scanner;

public class j62arrayrandom {

	public static void main(String[] args) {
		int i,x;
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements u want=>");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			x=random.nextInt(50);
			a[i]=x;
			System.out.print(a[i]+",");
		}


	}

}
