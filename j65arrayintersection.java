package java1;

public class j65arrayintersection {

	public static void main(String[] args) {
		int a1[]= {11,55,9,7,10};
		int a2[]= {10,1,2,11,4};
		int i=0,j=0;
		int x=a1.length;
		int y=a2.length;
		System.out.print("a1= ");
		for(i=0;i<x;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<y;j++)
		{
			System.out.print(a2[j]+",");
		}
		System.out.println();
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.print(a1[i]+",");
				}
			}
		}
	}
}
