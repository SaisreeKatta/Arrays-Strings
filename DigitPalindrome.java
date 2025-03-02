//Palindrome number
package com;

public class DigitPalindrome {
	public static void main(String[] args)
	{
		String s="J12s345p";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				s1=s1+ch;
			}
		
		}
	
	int num=Integer.parseInt(s1);
	int temp=num;
	int sum=0;
	while(temp!=0)
	{
		int ld=temp%10;
		sum+=ld;
		temp=temp/10;
	}
	int t=0;
	int rev=0;
	while(temp!=0)
	{
		int ld=temp%10;
		rev=rev*10+ld;
		temp=temp/10;
		
	}


	if(rev==sum)
	{
		System.out.println("it is palindrome number");
	}
	else
	{
		System.out.println("it is not a palindrome number");
	}
	}
	}
