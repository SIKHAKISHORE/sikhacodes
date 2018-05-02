package com.tcs;
import java.math.BigInteger;
public class assnmnt {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers= {"23423456","296456123","253145263"	};
		BigInteger sum=BigInteger.valueOf(0);
	for(int i=0;i<numbers.length;i++)
	{
		//int newnum = Long.parseLong(numbers[i]);
		BigInteger newnum = new BigInteger(numbers[i]);
		sum=sum.add(newnum);
	}
	String result=sum.toString().substring(0,5);
	System.out.println(result);
	}
}