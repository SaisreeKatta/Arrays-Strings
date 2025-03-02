package com;

public class Oddindex {
	public static void main(String[] args) {
	String s = "java programming";
	for (int i=1;i<=s.length()-1;i++)
	{
		if (i%2==1)
		{
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}
		
	}

}
