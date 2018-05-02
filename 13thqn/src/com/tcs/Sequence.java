package com.tcs;

import java.util.Scanner;
public class Sequence {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number!=1)
		{
			if(number%2==0)
				number=number/2;
			else
				number=(number*3)+1;
		System.out.println(number+" ");
		}
	}

}

