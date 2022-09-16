package java1;

import java.util.Random;
import java.util.Scanner;

public class j64arrayrandomposineg {

	public static void main(String[] args) {
		int i,x;
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements u want=>");
		int n=sc.nextInt();
		int a[]=new int[n];
		int cp=0,cn=0,sp=0,sn=0;
		for(i=0;i<n;i++)
		{
			x=random.nextInt(25+25)-25;
			a[i]=x;
			//System.out.print(a[i]+",");
			if(a[i]%2==0)
			{
				System.out.println(a[i]+"positive");
				cp++;
				sp=sp+a[i];
			}
			else
			{
				System.out.println(a[i]+"negative");
				cn++;
				sn=sn+a[i];
			}			
		}
		System.out.println("positive count=>"+cp);
		System.out.println("negative count=>"+cn);
		System.out.println("sum of positive integers=>"+sp);
		System.out.println("sum of negative integers=>"+sn);

	}

}
