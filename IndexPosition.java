package com;

public class IndexPosition {
	public static void IndexPosition(String s) {
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				System.out.println(i);
			}
				
		}
	}
	public static void main(String[] args)
	{
		String a = "I'm A Developer";
		IndexPosition(a);
	}
		
		
	
}


