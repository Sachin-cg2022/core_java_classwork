package datastorage;

import java.util.Scanner;

public class Ex7 {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 4 digit number :");
		int no=sc.nextInt();
		int reminder=0;int sum=0;
		for(int i=0;i<4;i++)
		{
			reminder=no%10;
		    sum=sum*10+reminder;
		    no=no/10;
		}
		System.out.println("The reversed number is :"+sum);
			}
}
