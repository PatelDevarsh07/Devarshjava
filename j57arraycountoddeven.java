package java1;

public class j57arraycountoddeven {

	public static void main(String[] args) {
		int a[]= {11,55,9,7,-2,6,-9,-11,10,1,-4};
		int n=a.length,i;
		int even=0,odd=0,sum=0;
		for(i=0;i<n;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println(a[i]+" => even");
			even++;
		}
		else
		{
			System.out.println(a[i]+" => odd");
			odd++;
		}
		sum=sum+a[i];
		}
		System.out.println("even count =>"+even);
		System.out.println("odd count =>"+odd);
		System.out.println("sum=>"+sum);

	}

}
