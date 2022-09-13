package java1;

import java.util.Scanner;

public class j40whilefactorialreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get factorial");
		int a= sc.nextInt();
        int i=a,fact=1;
        while(i>=1)
        {
        	fact=fact*i;
			System.out.print(i+"*");
			i--;
        }
        System.out.println(" => "+fact);

	}

}
