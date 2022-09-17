package java1;

public class j71arrayfactorial {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]=new int[10];
		int i=0,fact,x,j=0;
		int A=a1.length;
		System.out.print("a1= ");
		for(i=0;i<A;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<A;j++)
		{
			fact=1;
			for(x=1;x<=a1[j];x++)
			{
				fact=fact*x;
			}
			a2[j]=fact;
			System.out.print(a2[j]+",");
		}

	}

}
