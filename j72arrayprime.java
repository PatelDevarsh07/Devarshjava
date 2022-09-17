package java1;

public class j72arrayprime {

	public static void main(String[] args) {
		int a1[]= {1,2,3,5,17,22,31,45};
		int a2[]= new int[10];
		int i=0,x=0,j=0;
		int A=a1.length;
		int B=a2.length;
		System.out.print("a1= ");
		for(i=0;i<A;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		for(i=2;i<a1[i]/2;i++)
		{
			if(a1[i]%i==0)
			{
				x=200;
			}
		}
		System.out.println();
		System.out.println("a2= ");
		for(j=0;j<A;j++)
		{
			a2[j]=a1[i];
			if(x==0)
			{
				System.out.println(a2[j]+",");	
			}
		}

	}

}
