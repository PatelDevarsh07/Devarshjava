package java1;

import java.util.Scanner;

public class j84vstringvowels {

	public static void main(String[] args) {
		
		String name;
		String blank=" ";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String=> ");
		name=sc.nextLine();
        int x=name.length();
        char ch = 0;
        int count=0;
        int vowel=0;
        
        for(int i=x-1;i>=0;i--) 
        {
            ch=name.charAt(i);
            System.out.println(ch+" ");
    	     if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
    	     {
    	    	 blank=blank+count;
    	    	 count++;
    	    	 vowel++;    	           	         
             }
    	     else 
    	     {
    	    	blank=blank+ch;
    	     }
    	     
         }
            System.out.println();
            System.out.println(blank+" ");
            System.out.println("number of vowels in string is=>"+vowel);
	}
}
