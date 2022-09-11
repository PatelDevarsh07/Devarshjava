package java1;

import java.util.Scanner;

public class j18kbc {

	public static void main(String[] args) {
		System.out.println("1]Where is taj mahal");
		System.out.println("a for agra ");
		System.out.println("b for bihar ");
		System.out.println("c for up ");
		System.out.println("d for delhi ");
		Scanner sc=new Scanner(System.in);
		System.out.println("wht opt u wanna choose");
	    String opt1="",opt2="",opt3="",opt4="",opt5="";
	    opt1=sc.next();
	    opt1=opt1.toLowerCase();
	     
	    if(opt1.equals("a"))
	    {
	    	System.out.println("ans is correct");
	    	System.out.println("price is 1000");
	    }	
 	    else 
 	    { 
	        System.out.println("ans is wrong");	
 	    }
	    
	    if(opt1.equals("a"))
	    { 	
	    System.out.println("2]Where is agra");
		System.out.println("a for africa ");
		System.out.println("b for us ");
		System.out.println("c for usa ");
		System.out.println("d for india ");
		opt2=sc.next();
	    opt2=opt2.toLowerCase();
		
            if(opt2.equals("d"))
            {
            	System.out.println("ans is correct");
    	    	System.out.println("price is 3000");
            }
            else
            {
            	System.out.println("ans is wrong");
            }
		
		
            if(opt2.equals("d"))
    	    { 	
    	    System.out.println("3]What is ur hobby");
    		System.out.println("a for reading ");
    		System.out.println("b for writing ");
    		System.out.println("c for gym ");
    		System.out.println("d for football ");
    		opt2=sc.next();
    	    opt2=opt2.toLowerCase();
    		
                if(opt2.equals("d"))
                {
                	System.out.println("ans is correct");
        	    	System.out.println("price is 6000");
                }
                else
                {
                	System.out.println("ans is wrong");
                }
		
                if(opt2.equals("d"))
        	    { 	
        	    System.out.println("4]Who is father of nation");
        		System.out.println("a for bapu ");
        		System.out.println("b for trump ");
        		System.out.println("c for modi ");
        		System.out.println("d for dev ");
        		opt3=sc.next();
        	    opt3=opt3.toLowerCase();
        		
                    if(opt3.equals("d"))
                    {
                    	System.out.println("ans is correct");
            	    	System.out.println("price is 9000");
                    }
                    else
                    {
                    	System.out.println("ans is wrong");
                    }
		
        	    } 
         }

	}

	}

}
