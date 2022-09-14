package java1;

import java.util.Scanner;

public class j44armstrong {

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
	     rev=rev+(a*a*a);
	     no=no/10;
	    }
		System.out.println(" "+rev);
		System.out.println(" "+k);
		if(k==rev)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
