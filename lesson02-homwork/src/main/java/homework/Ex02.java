package homework;

import java.math.BigInteger;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println(sumBitInterger(4,7,12,18));
	}

	private static BigInteger sumBitInterger(int i, int j, int k, int l) {
		BigInteger sum= facturial(BigInteger.valueOf(i)).add(facturial(BigInteger.valueOf(j))).add(facturial(BigInteger.valueOf(k))).add(facturial(BigInteger.valueOf(l)));
		return sum;
	}

	private static BigInteger facturial(BigInteger a) {
		if(a.equals(BigInteger.valueOf(1))) {
			return a;
		}
		return a.multiply(facturial(a.subtract(BigInteger.valueOf(1))));
	}
}
