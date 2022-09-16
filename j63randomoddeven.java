package java1;

import java.util.Random;
import java.util.Scanner;

public class j63randomoddeven {

	public static void main(String[] args) {
		int i,x;
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements u want=>");
		int n=sc.nextInt();
		int a[]=new int[n];
		int ce=0,co=0,so=0,se=0;
		for(i=0;i<n;i++)
		{
			x=random.nextInt(20);
			a[i]=x;
			System.out.print(a[i]+",");
			if(a[i]%2==0)
			{
				System.out.println("even");
				ce++;
				se=se+a[i];
			}
			else
			{
				System.out.println("odd");
				co++;
				so=so+a[i];
			}			
		}
		System.out.println("count of even number=>"+ce);
		System.out.println("count of odd number=>"+co);
		System.out.println("sum of even integers=>"+se);
		System.out.println("sum of odd integers=>"+so);

	}

}
