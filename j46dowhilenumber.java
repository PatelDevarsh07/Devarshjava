package java1;

import java.util.Scanner;

public class j46dowhilenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt();
		int i=1;
		do
		{
			System.out.println(" "+i);
			i++;
		}
		while(i<=n);


	}

}
