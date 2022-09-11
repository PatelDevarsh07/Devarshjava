package java1;

import java.util.Scanner;

public class j17mathsquestions {

	public static void main(String[] args) {
		System.out.println("enter numbers : ");
		Scanner sc=new Scanner(System.in);
		System.out.println("first");
		int a1=sc.nextInt();
		System.out.println("second");
		int a2=sc.nextInt();
		System.out.println("Q1 - "+a1+"+"+a2);
		System.out.println("ans : ");
		int ans1=sc.nextInt();
		System.out.println("Q2 - "+a1+"-"+a2);
		System.out.println("ans : ");
		int ans2=sc.nextInt();
		System.out.println("Q3 - "+a1+"*"+a2);
		System.out.println("ans : ");
		int ans3=sc.nextInt();
		System.out.println("Q4 - "+a1+"/"+a2);
		System.out.println("ans : ");
		int ans4=sc.nextInt();
		System.out.println("Q5 - "+a1+"%"+a2);
		System.out.println("ans : ");
		int ans5=sc.nextInt();
		int c=0,w=0;
		if(ans1==(a1+a2))
		{
			c=c+1;
		}
		else
		{
			w=w+1;
		}
		if(ans2==(a1-a2))
		{
			c=c+1;
		}
		else
		{
			w=w+1;
		}
		if(ans3==(a1*a2))
		{
			c=c+1;
		}
		else
		{
			w=w+1;
		}
		if(ans4==(a1/a2))
		{
			c=c+1;
		}
		else
		{
			w=w+1;
		}
		if(ans5==(a1%a2))
		{
			c=c+1;
		}
		else
		{
			w=w+1;
		}
		System.out.println("Right Ans ="+c);
		System.out.println("Wrong Ans ="+w);
		}

	}


