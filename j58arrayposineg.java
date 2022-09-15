package java1;

public class j58arrayposineg {

	public static void main(String[] args) {
		int a[]= {11,55,9,7,-2,6,-9,-11,10,1,-4};
		int n=a.length,i;
		int posi=0,neg=0,sum=0,sp=0,sn=0;
		for(i=0;i<n;i++)
		{
		if(a[i]>0)
		{
			System.out.println(a[i]+" => positive");
			posi++;
			sp=sp+a[i];
		}
		else
		{
			System.out.println(a[i]+" => negative");
			neg++;
			sn=sn+a[i];
		}
		sum=sum+a[i];
		}
		System.out.println("positive count =>"+posi);
		System.out.println("negative count =>"+neg);
		System.out.println("sum =>"+sum);
		System.out.println("sum of positive =>"+sp);
		System.out.println("sum of negative =>"+sn);

	}

}
