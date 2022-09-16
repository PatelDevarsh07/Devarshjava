package java1;

public class j66arrayAminusB {

	public static void main(String[] args) {
		int a1[]= {11,55,9,7,10};
		int a2[]= {10,1,2,11,4};
		int i=0,j=0;
		int n1=a1.length;
		int n2=a2.length;
		System.out.print("a1= ");
		for(i=0;i<n1;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<n2;j++)
		{
			System.out.print(a2[j]+",");
		}
		System.out.println();
		System.out.println("a1-a2=> ");
		for(i=0;i<n1;i++)
		{
			int x=a1[i];
			int y=0;
			for(j=0;j<n2;j++)
			{
				if(x==a2[j])
				{
					y=y+1;
				}
			}
			if(y==0)
			{
				System.out.print(","+x);
			}
		}

	}

}
