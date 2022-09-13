package java1;

import java.util.Random;
import java.util.Scanner;

public class j35forrandomnumber {

	public static void main(String[] args) {
		int c=0,w=0;
		Scanner sc=new Scanner(System.in);
		Random random= new Random();
		System.out.println("How many que u want to ask");
		int b= sc.nextInt();
		System.out.println("which operator u wanna perform");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		int cho=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			 
		if(cho==1)
		{
		int x= random.nextInt(50);
		int y= random.nextInt(50);

        System.out.println("no1 ="+x+"no2 ="+y);
        System.out.println("Do addition");
        int a=sc.nextInt();
        if(a==x+y)
        {	
        	System.out.println("right");
             c=c+1;
              
        }     
        else
        	 System.out.println("wrrong");
            w=w+1;
		
		System.out.println("correct"+c);
		System.out.println("wrong"+w);
		}
		
		if(cho==2)
		{
		int x= random.nextInt(50);
		int y= random.nextInt(50);

        System.out.println("no1 ="+x+"no2 ="+y);
        System.out.println("Do subtraction");
        int a=sc.nextInt();
        if(a==x-y)
        {	
        	System.out.println("right");
             c=c+1;
              
        }     
        else
        	 System.out.println("wrrong");
            w=w+1;
			
		System.out.println("correct"+c);
		System.out.println("wrong"+w);
		}
		
		if(cho==3)
		{
		int x= random.nextInt(50);
		int y= random.nextInt(50);

        System.out.println("no1 ="+x+"no2 ="+y);
        System.out.println("Do Multiplication");
        int a=sc.nextInt();
        if(a==x*y)
        {	
        	System.out.println("right");
             c=c+1;
              
        }     
        else
        	 System.out.println("wrrong");
            w=w+1;
			
		System.out.println("correct"+c);
		System.out.println("wrong"+w);
		}
		
		if(cho==4)
		{
		int x= random.nextInt(50);
		int y= random.nextInt(50);

        System.out.println("no1 ="+x+"no2 ="+y);
        System.out.println("Do Division");
        int a=sc.nextInt();
        if(a==x/y)
        {	
        	System.out.println("right");
             c=c+1;
              
        }     
        else
        	 System.out.println("wrrong");
            w=w+1;
			
		System.out.println("correct"+c);
		System.out.println("wrong"+w);
		}
   }
}

}
