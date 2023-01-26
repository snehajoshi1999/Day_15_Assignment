package com.brizlabs.hashmap;


import java.util.HashMap;

public class FindFrequencyOfWord
{
	
	public static void main(String[] args) 
	{
		
	
		String Sentence="To be or not to be";
		
		char[]word=Sentence.toCharArray();
		HashMap<Character, Integer>myhashmap=new HashMap<>();
		for(int i=0;i<word.length;i++)
		{
			
			if(myhashmap.containsKey(word[i]))
			{
				int count=myhashmap.get(word[i]);
				myhashmap.put(word[i], count+1);
			}else
			{
				myhashmap.put(word[i], 1);
			}
		}
		System.out.println(myhashmap);
	}

	
		

	}