package com;

public class ReverseWord {
	public static void ReverseEachWord(String s)
	{
		String []a=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
	public static void main(String[] args)
	{
		String a="This is India";
		ReverseEachWord(a);
		
	}

}
