//Write a to print duplicate characters from the given string?

package stringsexample;

import java.util.*;

public class StringsEx3 {

	public static void main(String[] args) 
	{
	String str="destination";
	char a[]=str.toCharArray();
	Map<Character,Integer> hm=new HashMap<Character,Integer>();
	for(char ch:a)
	{
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
			
		}
		else
		{
			hm.put(ch, 1);
		}
	}
	
	Set<Character>keys=hm.keySet();
	for(char ch:keys)
	{
		if(hm.get(ch)>1)
		{
			System.out.println("character "+ch+" repeated "+hm.get(ch)+" times");
		}
	}

	}

}
