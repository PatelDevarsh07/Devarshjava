package java1;

import java.util.Scanner;

public class j10salarydonation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter salary=> ");
		int s=sc.nextInt();
		float d=(float)(s*0.1);
		System.out.println("donation=> "+d);

	}

}
