package java1;

public class j70arraysplit {

	public static void main(String[] args) {
		int a1[]= {11,20,49,55,67,78};
		int a2[]=new int[100];
		int a3[]=new int[100];
		int i=0,j=0,k=0;
		int A=a1.length;
		System.out.print("a1= ");
		for(i=0;i<A;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		for(i=0;i<A;i++)
		{
			if(a1[i]%2==0)
			{
				a2[j]=a1[i];
				j++;
			}
			else
			{
				a3[k]=a1[i];
				k++;
			}
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<A;j++)
		{
			System.out.print(a2[j]+",");
		}
		System.out.println();
		System.out.print("a3= ");
		for(k=0;k<A;k++)
		{
			System.out.print(a3[k]+",");
		}

	}

}
