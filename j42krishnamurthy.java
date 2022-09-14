package java1;

import java.util.Scanner;

public class j42krishnamurthy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int a,rev=0;
		int no;
		int sum=0;
		
		System.out.println("enter number");
	    no= sc.nextInt();
	    int k=no;
		while(no>0)
		{
	     a=no%10;
	     int fact=1;
	     for(int i=1;i<=a;i++)
	    	 fact=fact*i;
	         sum=sum+fact;
	         no=no/10;
		}
		if(sum==k)
			System.out.println("it is krishnamurthy");
		else
			System.out.println("it is not a krishnamurthy");

	}

}
