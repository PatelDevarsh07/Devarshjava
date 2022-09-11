package java1;

import java.util.Scanner;

public class j19menu {

	public static void main(String[] args) {
		System.out.println("1] Pizza");
		System.out.println("2] Burger");
		System.out.println("3] Dosa ");
		System.out.println("4] All ");
		System.out.println("Enter food u wanna eat: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1)
		{
			System.out.println("How many pizza u want");
			int quantity=sc.nextInt();
			int p=quantity*250;
			System.out.println("Ur bill is: "+p);
		}
		else if(x==2)
		{
			System.out.println("How many burger u want");
			int quantity=sc.nextInt();
			int b=quantity*60;
			System.out.println("Ur bill is: "+b);
		}
		else if(x==3)
		{
			System.out.println("How many dosa u want");
			int quantity=sc.nextInt();
			int d=quantity*120;
			System.out.println("Ur bill is: "+d);
		}
		else if(x==4)
		{
			System.out.println("Enter quantity for all");
			System.out.println("How many pizza u want");
			int quantity=sc.nextInt();
			int p=quantity*250;
			
			System.out.println("How many burger u want");
			int quanti=sc.nextInt();
			int b=quanti*120;
			
			System.out.println("How many dosa u want");
			int quant=sc.nextInt();
			int d=quant*60;
			
			int total=p+b+d;
			System.out.println("Ur bill for pizza is: "+p);
			System.out.println("Ur bill for buger is: "+b);
			System.out.println("Ur bill for dosa is: "+d);
			System.out.println("Ur total bill is: "+total);
			}
		else
		{
			System.out.println("invalid order");
		}
	}
}
