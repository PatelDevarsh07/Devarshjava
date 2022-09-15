package java1;

import java.util.Scanner;

public class j52dowhilehotel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,x=0,y=0,z=0;
		int b=0,p=0,m=0;
		int sum=0;
		do
		{
		  System.out.println("enter 1 for pizza ");
		  System.out.println("enter 2 for pasta ");
		  System.out.println("enter 3 for maggi ");
		  System.out.println("enter 4 for exit ");
		  System.out.println("enter number ");
		  a= sc.nextInt();
		  
		  if(a==1)
		  {  
			System.out.println("how many pizza u want");
	        b= sc.nextInt();
	        x=b*120;
	        System.out.println("ur bill for pizza is: "+x);	        
		  }
		  if(a==2)
		  {  
			System.out.println("how many pasta u want");
	        p= sc.nextInt();
	        y=p*80;
	        System.out.println("ur bill for pasta is: "+y);	        
		  }
		  if(a==3)
		  {  
			System.out.println("how many maggi u want");
	        m= sc.nextInt();
	        z=m*60;
	        System.out.println("ur bill for maggi is: "+z);	        
		  }
		  if(a==4)
		  {
			  x=b*120;
			  System.out.println("ur bill for pizza is: "+x);
			  y=p*80;
			  System.out.println("ur bill for pasta is: "+y);
			  z=m*60;
			  System.out.println("ur bill for maggi is: "+z);
			  sum=x+y+z;
		      System.out.println("total bill: "+sum);
		  }
		}while(a!=5);
		System.out.println("invalid");

	}

}
