package java1;

public class j56arrayoddeven {

	public static void main(String[] args) {
		int a[]= {11,55,9,7,-2,6,-9,-11,10,1,-4};
		int n=a.length,i;
		
		for(i=0;i<n;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println(a[i]+" => even");
		}
		else
		{
			System.out.println(a[i]+" => odd");
		}
		}

	}

}
