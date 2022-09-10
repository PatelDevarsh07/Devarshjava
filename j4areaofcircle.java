package java1;

import java.util.Scanner;

public class j4areaofcircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of Radius=> ");
        float r=sc.nextInt();
        float a=(float)(r*r*3.14);
        System.out.println("Area of circle is=> "+a);
	}

}
