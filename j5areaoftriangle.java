package java1;

import java.util.Scanner;

public class j5areaoftriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of base=> ");
        int b=sc.nextInt();
        System.out.println("Enter value of height=> ");
        int h=sc.nextInt();
        float a=(float)(h*b*0.5);
        System.out.println("Area of triangle is=> "+a);

	}

}
