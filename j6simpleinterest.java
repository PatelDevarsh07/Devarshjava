package java1;

import java.util.Scanner;

public class j6simpleinterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of principal=> ");
		int p=sc.nextInt();
		System.out.println("Enter value of rate=> ");
		int r=sc.nextInt();
		System.out.println("Enter value of time=> ");
		int t=sc.nextInt();
		float s=(float)(p*r*t*0.01);
		System.out.println("simple interest=> "+s);

	}

}
