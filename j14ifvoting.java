package java1;

import java.util.Scanner;

public class j14ifvoting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age=> ");
		int a=sc.nextInt();
		if(a>21)
		{
			System.out.println("u r eligible for voting");
		}
		else
		{
			System.out.println("u r not eligible for voting");
		}


	}

}
