package stringsexample;

import java.util.Scanner;

/*Write a program to accept string from the 
keyboad and split the entered 
string in to words and count number of 
words in the string?*/
		
public class StringsEx5{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		
		
		String words[]=str.split(" ");
		for(String w:words)
		{
			System.out.println(w);
			System.out.println(w.length());
		}
		
		
		
		
	}

}

