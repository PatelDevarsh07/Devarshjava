package java1;

import java.util.Scanner;

public class j49dowhilefactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get factorial");
		int a= sc.nextInt();
        int i=1,fact=1;
        do
        {
        	fact=fact*i;
			System.out.print(i+"*");
			i++;
        }
        while(i<=a);
        System.out.println(" => "+fact);

	}

}
