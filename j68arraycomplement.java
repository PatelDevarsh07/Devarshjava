package java1;

public class j68arraycomplement {

	public static void main(String[] args) {
		int a1[]= {11,55,9,7,22};
		int a2[]= {11,100,22,222};
		int i=0,j=0,y=0;
		int a=a1.length;
		int b=a2.length;
		System.out.print("a1= ");
		for(i=0;i<a;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		System.out.print("a2= ");
		for(j=0;j<b;j++)
		{
			System.out.print(a2[j]+",");
		}
		System.out.println();
		System.out.println("intersection is=> ");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println(a1[i]+",");
				}
			}
		}
		System.out.println();
		System.out.println("complement of intersection=> ");
		for(i=0;i<a;i++)
		{
			y=0;
			for(j=0;j<b;j++)
			{
				if(a1[i]==a2[j])
				{
					y=y+1;
				}
			}
			if(y==0)
			{
				System.out.print(a1[i]+",");
			}
		}
		for(i=0;i<b;i++)
		{
			y=0;
			for(j=0;j<a;j++)
			{
				if(a2[i]==a1[j])
				{
					y=y+1;
				}
			}
			if(y==0)
			{
				System.out.print(a2[i]+",");
			}
		}

	}

}
