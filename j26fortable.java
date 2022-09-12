package java1;

import java.util.Scanner;

public class j26fortable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which table u wanna perform");
		int a= sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(a+"*"+i+" => "+(a*i));
		}

	}

}
