package DSA;
import java.util.Scanner;
public class permutations 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number N");
		int n=sc.nextInt();
		System.out.println("Enter the Number p");
		int p=sc.nextInt();
		int nfact=1;
		for(int i=1; i<=n; i++)
		{
			nfact=nfact*i;
		}
		int nnrfact=1;
		for(int i=1; i<=n-p; i++)
		{
			nnrfact=nnrfact*i;
		}
		int npr=nfact/nnrfact;
		System.out.println(n+"  "+p+" "+npr);
		
		
		
	}

}
