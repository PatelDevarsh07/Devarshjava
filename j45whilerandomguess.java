package java1;

import java.util.Random;
import java.util.Scanner;

public class j45whilerandomguess {

	public static void main(String[] args) {
		int t=0;
		Scanner sc=new Scanner(System.in);
		Random random= new Random();
		int x= random.nextInt(10);
		System.out.println("x= "+x);
		int y=0;
		int s=1,e=30;
		System.out.println("ur range is from "+s+"to "+e);
		while(x!=y)
		{	
		System.out.println("Enter guess value");
	    y= sc.nextInt();
		if(x>y)
		{
		System.out.println("think greater than that");
		System.out.println("now ur range is from "+y+"to "+e);
		}
		else if(x<y)
		System.out.println("think lesser than that");
		System.out.println("ur range is from"+s+"to "+y);
		t++;
		}
		System.out.println("how many times u tried "+t);

	}

}
