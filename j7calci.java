package java1;

import java.util.Scanner;

public class j7calci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one number=> ");
		float a=sc.nextInt();
		System.out.println("Enter another number=> ");
		float b=sc.nextInt();
		float x=a+b;
		System.out.println("addition=> "+x);
		float y=a-b;
		System.out.println("subtraction=> "+y);
		float z=a*b;
		System.out.println("multiplication=> "+z);
		float w=a/b;
		System.out.println("division=> "+w);
	}

}
