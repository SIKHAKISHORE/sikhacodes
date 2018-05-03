package com.tcs;

public class Grid {

	public static void main(String[] args) {
		long gridsize =20;
		long p=1;
		for(int i=1;i<gridsize;i++)
		{
			p*=((2*gridsize)-i)/(i+1);
		}
		System.out.println(p);
		
	}
	
}
	