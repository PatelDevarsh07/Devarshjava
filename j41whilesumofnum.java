package java1;

import java.util.Scanner;

public class j41whilesumofnum {

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
	     rev=rev*10+a;
	     no=no/10;
	     sum=sum+a;
		}
		System.out.println(" "+rev);
		System.out.println(" "+sum);
		System.out.println(" "+k);


	}

}
