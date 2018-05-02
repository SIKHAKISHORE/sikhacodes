package com.tcs;
import java.math.BigInteger;
public class Grid {

	public static void main(String[] args) {
		BigInteger b=BigInteger.valueOf(20);
		BigInteger output=BigInteger.valueOf(fact(b));
		//output=fact(20);
    //output=fact(40)/(fact(2)*fact(38));
	System.out.println(output);
	
	}



static BigInteger fact(BigInteger x)
{
	BigInteger a=BigInteger.valueOf(1);
	if(x.equals(a))
		return a;
	BigInteger product=BigInteger.valueOf((fact(x.subtract(1))).multiply(x));
	return product;
}
}