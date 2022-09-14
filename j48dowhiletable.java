package java1;

import java.util.Scanner;

public class j48dowhiletable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which table u wanna perform");
		int a= sc.nextInt();
        int i=1;
        do
        {
        	System.out.println(a+"*"+i+" => "+(a*i));
        	i++;
        }
        while(i<=10);

	}

}
