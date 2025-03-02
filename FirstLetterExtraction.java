package com;

public class FirstLetterExtraction {
	public static void extractionofFirstLetter(String s)
	{
		String [] a =s.split("");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i].charAt(0));
		}
		
		
	}
	public static void main(String [] args)
	{
		String s="This is India";
		extractionofFirstLetter(s);
		
		
		
	}

}
