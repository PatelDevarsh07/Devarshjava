package java1;

import java.util.Scanner;

public class j54dowhilestringcalci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		do
		{
		  System.out.println("enter 1 for addition ");
		  System.out.println("enter 2 for subtraction ");
		  System.out.println("enter 3 for multiplication ");
		  System.out.println("enter 4 for division ");
		  System.out.println("enter esc for exit ");
		  System.out.println("enter number ");
		  a=sc.next();
		  a=a.toLowerCase();
		  
		  if(a.equals("add"))
		     { 
		    	System.out.println("enter one number");
		        int b= sc.nextInt(); 
		        System.out.println("enter another number");
		        int c= sc.nextInt(); 
		        int i=b+c;
		        System.out.println("addition=>"+i);
		     }
		  if(a.equals("sub"))
		     { 
		    	System.out.println("enter one number");
		        int b= sc.nextInt(); 
		        System.out.println("enter another number");
		        int c= sc.nextInt(); 
		        int i=b-c;
		        System.out.println("subtraction=>"+i);
		     }
		  if(a.equals("mul"))
		     { 
		    	System.out.println("enter one number");
		        int b= sc.nextInt(); 
		        System.out.println("enter another number");
		        int c= sc.nextInt(); 
		        int i=b*c;
		        System.out.println("multiplication=>"+i);
		     }
		  if(a.equals("div"))
		     { 
		    	System.out.println("enter one number");
		        int b= sc.nextInt(); 
		        System.out.println("enter another number");
		        int c= sc.nextInt(); 
		        int i=b/c;
		        System.out.println("division=>"+i);
		     }
		
		
		}while(a.equals("esc"));
		System.out.println("exit");

	}

}
