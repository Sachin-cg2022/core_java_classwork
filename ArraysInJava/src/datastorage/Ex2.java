package datastorage;

import java.util.Scanner;

public class Ex2 {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first positive integer:");
		int p=sc.nextInt();
		System.out.println("Enter the second positive integer:");
		int q=sc.nextInt();
		int gcd=1;
		for(int i=120;i<=p&&i<=q;i++)
		{
			if(p%i==0 && q%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("the GCD of the p and q is"+ gcd);
			}
}
