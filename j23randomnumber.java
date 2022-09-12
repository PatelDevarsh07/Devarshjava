package java1;

import java.util.Random;
import java.util.Scanner;

public class j23randomnumber {

	public static void main(String[] args) {
		Random random=new Random();
		int x= random.nextInt(20);
		int y= random.nextInt(20);
		System.out.println("No1 = "+x+"No2 = "+y);
		System.out.println("Give addition of two numbers");
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt();
		if(ans==(x+y))
		{
			System.out.println("Ur ans is correct");
		}
		else
		{
			System.out.println("Ur ans is wrong");
		}
	}

}
