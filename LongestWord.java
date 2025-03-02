//longeststring
package com;

public class LongestWord {
	public static void main(String[] args)
	{
		String s="I am A Java Developer";
		String [] s1=s.split(" ");
		int length=0;
		String longestString="";
		for(int i=0;i<=s1.length-1;i++)
		{
			if(s1[i].length()>length)
			{
				length=s1[i].length();
				longestString=s1[i];
			}
		}
		System.out.println("longest string is"+longestString+"with the size of"+length);
					
		
	}

}
