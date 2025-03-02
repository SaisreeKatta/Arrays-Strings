package com;

public class CountAlpOfVowelsAndDigits
{
	public static boolean isEmpty(String s)
	{
		if (s.length()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void count(String s)
	{
		
		int vowelCount=0;
		int digitCount=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
						{
					      vowelCount++;
						}
			}
			else if(Character.isDigit(ch))
			{
				digitCount=digitCount+1;
			}
		}
		System.out.println("vowelCount:"+vowelCount);
		System.out.println("digitCount:"+digitCount);
	}
	public static void main(String[] args)
	{
		String s = "Java123";
		if (isEmpty(s))
		{
			System.out.println("String is empty");
		}
		else
		{
			count(s);
		}
	}
	
	
	
	
}


