// Write a java program to remove all duplicates from a given string?


package stringsexample;

import java.util.HashSet;

public class StringEx2 {

	public static void main(String[] args) 
	{
	String str="hello everyone";
	char a[]=str.toCharArray();
	String nw="";
	HashSet<Character> hs=new HashSet<Character>();
	for(char ch:a)
	{
		if(!hs.contains(ch))
		{
			hs.add(ch);
			nw=nw+ch;
		}
		else
		{
			System.out.println("duplicate character removed are "+ch);
		}
	}
	System.out.println("String after removing duplicates "+nw);

	}

}

