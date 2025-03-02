package com;

public class UpperAndLower {
	public static void main(String[] args)
	{
		String s="InDia";
		String res="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				if(Character.isLowerCase(ch))
				{
					res = res+Character.toUpperCase(ch);
				}
				else 
				{
					res=res+Character.toLowerCase(ch);
				}
			}
			
		}
		System.out.println(res);
	}
}
		
			