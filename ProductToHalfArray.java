package com;

public class ProductToHalfArray {
	public static void main(String[] args)
	{
		int []a= {5,6,7,8,9,2,3,4};
		int pro=1;
		for(int i=0;i<=(a.length-1)/2;i++)
		{
			pro=pro*a[i];
		
		}
		System.out.println(pro);
	}

}
