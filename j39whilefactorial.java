package java1;

import java.util.Scanner;

public class j39whilefactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get factorial");
		int a= sc.nextInt();
        int i=1,fact=1;
        while(i<=a)
        {
        	fact=fact*i;
			System.out.print(i+"*");
			i++;
        }
        System.out.println(" => "+fact);

	}

}
