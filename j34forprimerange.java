package java1;

import java.util.Scanner;

public class j34forprimerange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no= sc.nextInt();
		int c=0,x,j;
		System.out.print("1 2 3 ");
		for(j=5;j<=no;j++)
		{
			c=0;
			x=j;
			for(int i=2;i<x/2;i++)
			{
				if(x%i==0)
				{
				c=200;
				break;
				
				}
			}
			if(c==0)
			{
				System.out.print(x+ " ");
			}
		}


	}

}
