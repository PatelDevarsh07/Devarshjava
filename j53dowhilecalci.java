package java1;

import java.util.Scanner;

public class j53dowhilecalci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		do
		{
	     System.out.println("enter 1 for addition ");
	     System.out.println("enter 2 for subtraction ");
	     System.out.println("enter 3 for multiplication ");
	     System.out.println("enter 4 for division ");
	     System.out.println("enter 5 for exit ");
	     System.out.println("enter number ");
	      a= sc.nextInt();
	     
	     if(a==1)
	     { 
	    	System.out.println("enter one number");
	        int b= sc.nextInt(); 
	        System.out.println("enter another number");
	        int c= sc.nextInt(); 
	        int i=b+c;
	        System.out.println("addition=>"+i);
	     }
	     if(a==2)
	     { 
	    	System.out.println("enter one number");
	        int b= sc.nextInt();
	        System.out.println("enter another number");
	        int c= sc.nextInt();
	        int i=b-c;
	        System.out.println("subtraction=>"+i);
	     }
	     if(a==3)
	     { 
	    	System.out.println("enter one number");
	        int b= sc.nextInt();
	        System.out.println("enter another number");
	        int c= sc.nextInt();
	        int i=b*c;
	        System.out.println("multiplication=>"+i);
	     }
	     if(a==4)
	     { 
	    	System.out.println("enter one number");
	        int b= sc.nextInt();
	        System.out.println("enter another number");
	        int c= sc.nextInt();
	        int i=b/c;
	        System.out.println("division=>"+i);
	     } 
		}
		while(a!=5);
		 System.out.println("exit");

	}

}
