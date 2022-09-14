package java1;

import java.util.Scanner;

public class j43palendrop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int a,rev=0;
		int no;
		
		System.out.println("enter number");
	    no= sc.nextInt();
	    int k=no;
		while(no>0)
		{
	     a=no%10;
	     rev=rev*10+a;
	     no=no/10;
	     }
		if(k==rev)
			System.out.println("it is palendrop number");
		else
			System.out.println("it is not a palendrop number");
		System.out.println(" "+rev);
		System.out.println(" "+k);

	}

}
