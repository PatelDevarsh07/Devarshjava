package java1;

public class j69arraymerge {

	public static void main(String[] args) {
		int a1[]= {11,55,9,7,10};
		int a2[]= {10,1,2,11,4};
		int i=0,j=0;
		int A=a1.length;
		int B=a2.length;
		int C=a1.length+a2.length;
		int a3[]=new int[C];
		System.out.print("a1= ");
		for(i=0;i<A;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<B;j++)
		{
			System.out.print(a2[j]+",");
		}
		System.out.println();
		System.out.println("merge= ");
		for(i=0;i<A;i++)
		{
			a3[i]=a1[i];
		}
		for(j=0;j<B;j++)
		{
			a3[A+j]=a2[j];
		}
		for(j=0;j<C;j++)
		{
			System.out.print(a3[j]+",");
		}
		
	}

}
