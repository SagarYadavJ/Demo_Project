package com.demo.JavaProgramBranch;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurence {
	  
	public static void main(String[] args)
	{
		String str = "Java is programming language";
		
		Map<Character,Integer> charCount = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(charCount.containsKey(ch))
			{
			    charCount.put(ch,charCount.get(ch)+1);
			}else {
				charCount.put(ch,1);
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry : charCount.entrySet())
		{
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
		
	}

}
